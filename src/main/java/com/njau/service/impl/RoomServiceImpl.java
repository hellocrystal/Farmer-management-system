package com.njau.service.impl;

import com.njau.domain.vo.RoomUserVO;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.mapper.StaffMapper;
import com.njau.repo.mapper.UserMapper;
import com.njau.repo.pojo.*;
import com.njau.service.RoomService;
import com.njau.service.UserService;
import com.njau.util.PageRequest;
import com.njau.util.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * RoomServiceImpl
 *
 * @since 2022/04/19.
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private UserService userService;

    @Override
    public List<RoomUserVO> findByZone(int zone) {
        return userService.findByZone(zone);
    }

    @Override
    public PageResult findPage(PageRequest pageQuery) {
        List<RoomUserVO> res = userService.findAll();
        PageResult pr = new PageResult();
        pr.setContent(res);
        pr.setTotalSize(res.size());
        return pr;
    }


    @Override
    public PageResult fuzzyQuery(String name) {

        List<RoomUserVO> res = new ArrayList<>();
        UserExample userExample = new UserExample();
        if (name != null) userExample.createCriteria().andNameLike("%" + name.trim() + "%");
        List<UserDO> userDOS = userMapper.selectByExample(userExample);
        for (UserDO userDO : userDOS) {
            if (staffMapper.selectByPrimaryKey(userDO.getUsername()) != null) continue;
            RoomUserVO roomUserVO = new RoomUserVO();
            RoomExample roomExample = new RoomExample();
            roomExample.createCriteria().andUsernameEqualTo(userDO.getUsername());
            List<RoomDO> roomDOS = roomMapper.selectByExample(roomExample);
            if (roomDOS.size() > 0) {
                RoomDO room = roomDOS.get(0);
                roomUserVO.setRoomId(room.getId());
                roomUserVO.setZone(room.getZone());
                BeanUtils.copyProperties(userDO, roomUserVO);
            }
            res.add(roomUserVO);
        }
        PageResult pr = new PageResult();
        pr.setContent(res);
        pr.setTotalSize(res.size());
        return pr;
    }

    @Override
    public RoomDO findRoomByKey(RoomDOKey roomDOKey) {
        return roomMapper.selectByPrimaryKey(roomDOKey);
    }

    @Override
    public void addUser(String username, Date date, Integer zone, String roomID) {
        roomMapper.addUser(username, date, zone, roomID);
    }

    @Override
    public RoomDO findByUsername(String username) {
        RoomExample example = new RoomExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<RoomDO> rooms = roomMapper.selectByExample(example);
        if (rooms.size() == 0) {
            return null;
        }
        return rooms.get(0);
    }

    @Override
    public UserDO findByRoom(RoomDOKey roomDoKey) {
        RoomDO room = roomMapper.selectByPrimaryKey(roomDoKey);
        return userMapper.selectByPrimaryKey(room.getUsername());
    }
}
