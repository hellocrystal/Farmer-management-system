package com.njau.service.impl;

import com.njau.domain.vo.BillVO;
import com.njau.domain.vo.UserBillVO;
import com.njau.repo.mapper.FeeItemMapper;
import com.njau.repo.mapper.FeeMapper;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.mapper.UserMapper;
import com.njau.repo.pojo.*;
import com.njau.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * BillServiceImpl
 *
 * @since 2022/04/19.
 */
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private FeeMapper feeMapper;
    @Autowired
    private FeeItemMapper feeItemMapper;

    @Override
    public UserBillVO findUserBillByUsername(UserDO user) {
        return findUserBillByUsernameAndStatus(user, null);
    }

    @Override
    public UserBillVO findUserBillByUsernameAndStatus(UserDO user, String status) {

        UserBillVO userBillVO = new UserBillVO();
        userBillVO.setUsername(user.getUsername());
        userBillVO.setName(user.getName());
        userBillVO.setPhone(user.getPhone());
        userBillVO.setBill(new ArrayList<>());
        userBillVO.setTotal(0);
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria().andUsernameEqualTo(user.getUsername());
        List<RoomDO> rooms = roomMapper.selectByExample(roomExample);
        for (RoomDO room : rooms) {
            FeeExample feeExample = new FeeExample();
            FeeExample.Criteria c = feeExample.createCriteria().andZoneEqualTo(room.getZone()).andRoomIdEqualTo(room.getId());
            if (status != null) {
                c.andStateEqualTo(Byte.valueOf(status));
            }
            List<FeeDO> fees = feeMapper.selectByExample(feeExample);

            for (FeeDO fee : fees) {
                BillVO billVO = new BillVO();
                billVO.setId(fee.getId());
                FeeItemDO feeItem = feeItemMapper.selectByPrimaryKey(fee.getFeeItemId());
                billVO.setName(feeItem.getName());
                billVO.setMoney(feeItem.getMoney());
                billVO.setStatus(fee.getState().equals(Byte.valueOf("0")) ? "未支付" : "已支付");
                billVO.setTime(fee.getTime());
                userBillVO.setTotal(userBillVO.getTotal() + feeItem.getMoney());
                userBillVO.getBill().add(billVO);
            }
        }
        return userBillVO;
    }

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBillVO> listUnPayUser() {
        List<UserBillVO> list = userMapper.unpayfy();
        for (UserBillVO userBillVO : list) {
            userBillVO.setTotal(userBillVO.getBill().stream().mapToInt(BillVO::getMoney).sum());
        }
        return list;

    }
}
