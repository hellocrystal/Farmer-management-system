package com.njau.service.impl;

import com.njau.repo.mapper.FeeItemMapper;
import com.njau.repo.mapper.FeeMapper;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.pojo.*;
import com.njau.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * FeeServiceImpl
 *
 * @since 2022/04/23.
 */
@Service
public class FeeServiceImpl implements FeeService {
    @Autowired
    private FeeMapper feeMapper;

    @Autowired
    private FeeItemMapper feeItemMapper;

    @Override
    public void deleteByRoom(RoomDO room) {
        FeeExample example = new FeeExample();
        example.createCriteria().andRoomIdEqualTo(room.getId()).andZoneEqualTo(room.getZone());
        feeMapper.deleteByExample(example);
    }

    @Autowired
    private RoomMapper roomMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addFeeItem(String username, FeeItemDO billitem) {
        // 添加费用项目
        feeItemMapper.insert(billitem);
        // 添加费用
        List<RoomDO> rooms = roomMapper.selectByExample(new RoomExample());
        for (RoomDO room : rooms) {
            if(room.getUsername() == null) continue;
            FeeDO fee = new FeeDO();
            fee.setFeeItemId(billitem.getId());
            fee.setZone(room.getZone());
            fee.setRoomId(room.getId());
            fee.setState(Byte.valueOf("0"));
            fee.setStaffUsername(username);
            fee.setTime(new Date());
            feeMapper.insert(fee);
        }
    }

    @Override
    public Boolean payFee(Integer id) {
        FeeDO feeDO = feeMapper.selectByFeeId(id);
        if(feeDO == null) return false;
        feeMapper.setStateByFeeId((byte) 1, id);
        return true;
    }
}
