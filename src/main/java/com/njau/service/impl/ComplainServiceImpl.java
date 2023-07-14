package com.njau.service.impl;

import com.njau.domain.vo.ComplainVO;
import com.njau.repo.mapper.ComplainMapper;
import com.njau.repo.pojo.ComplainDO;
import com.njau.repo.pojo.ComplainExample;
import com.njau.repo.pojo.RoomDO;
import com.njau.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * FeeServiceImpl
 *
 * @since 2022/04/23.
 */

@Service
public class ComplainServiceImpl implements ComplainService {
    @Autowired
    private ComplainMapper complainMapper;

    @Override
    public void deleteByRoom(RoomDO room) {
        ComplainExample example = new ComplainExample();
        example.createCriteria().andRoomIdEqualTo(room.getId()).andZoneEqualTo(room.getZone());
        complainMapper.deleteByExample(example);
    }

    @Override
    public List<ComplainVO> findByUsername(String username) {
        return complainMapper.xSql(username,null);
    }

    @Override
    public List<ComplainVO> findByState(Byte state) {
        return complainMapper.xSql(null,state);
    }

    @Override
    public List<ComplainVO> findAll() {
        return complainMapper.xSql(null,null);
    }

    @Override
    public Boolean setStateAndTimeById(Integer id, String staffUsername, Date handleTime) {
        ComplainDO complainDO = complainMapper.selectByPrimaryKey(id);
        if (complainDO == null) return false;
        complainMapper.setStateAndTimeById(id, staffUsername, handleTime);
        return true;
    }
}
