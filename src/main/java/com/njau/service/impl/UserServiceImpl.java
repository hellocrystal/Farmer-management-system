package com.njau.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.njau.domain.query.UserRegisterRequest;
import com.njau.domain.query.UserUpdateRequest;
import com.njau.domain.vo.RoomUserVO;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.mapper.UserMapper;
import com.njau.repo.pojo.RoomDO;
import com.njau.repo.pojo.RoomDOKey;
import com.njau.repo.pojo.UserDO;
import com.njau.repo.pojo.UserExample;
import com.njau.service.*;
import com.njau.util.PageRequest;
import com.njau.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * UserService
 *
 * @since 2022/04/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private FeeService feeService;
    @Autowired
    private CarportService carportService;
    @Autowired
    private ComplainService complainService;
    @Autowired
    private NoticeService noticeService;

    @Override
    public UserDO findByPhone(String otel) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(otel);
        List<UserDO> users = userMapper.selectByExample(userExample);
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public UserDO findByUsername(String username) {
        return userMapper.selectByPrimaryKey(username);
    }

    @Override
    public List<RoomUserVO> findByZone(int zone) {
        return userMapper.findByZone(zone);
    }


    @Override
    public List<RoomUserVO> findAll() {
        return userMapper.findByZone(null);
    }

    @Override
    public PageResult findPage(PageRequest pageQuery) {
        PageHelper.clearPage();

        Page<?> page = PageHelper.startPage(pageQuery.getPageNum(), pageQuery.getPageSize());

        PageResult res = new PageResult();
        res.setContent(userMapper.selectByExample(new UserExample()));
        res.setPageNum(page.getPageNum());
        res.setPageSize(page.getPageSize());
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String addUser(UserRegisterRequest record) {
        // 判断手机号是否冲突
        UserDO usernameCheck = findByUsername(record.getUsername());
        if (usernameCheck != null) return "用户名已存在";

        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdcardEqualTo(record.getOidentity());
        List<UserDO> identityCheck = userMapper.selectByExample(userExample);
        if (identityCheck != null && identityCheck.size() == 1) return "该身份证号已被注册";

        UserDO userDO = new UserDO();
        userDO.setUsername(record.getUsername());
        userDO.setIdcard(record.getOidentity());
        userDO.setPhone(record.getOtel());
        userDO.setName(record.getOname());
        userDO.setPassword(record.getPass2());
        userDO.setAge(record.getOage());
        userDO.setSex(record.getOsex());
        userDO.setRegistTime(new Date());
        RoomDOKey roomDOKey = new RoomDOKey();
        roomDOKey.setZone(record.getTowernum());
        roomDOKey.setId(record.getOdoorplate());
        RoomDO roomDO = roomService.findRoomByKey(roomDOKey);
        if (roomDO == null || roomDO.getUsername() != null) return "未查到此房间或此房间已入住";


        userMapper.insertSelective(userDO);
        roomService.addUser(record.getUsername(), new Date(), roomDOKey.getZone(), roomDOKey.getId());
        return "success";
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUsername(String username) {
        RoomDO room = roomService.findByUsername(username);
        // 删除车位
        carportService.deleteByRoom(room);
        // 删除费用
        feeService.deleteByRoom(room);
        // 删除投诉
        complainService.deleteByRoom(room);
        // 删除通知
        noticeService.deleteByRoom(room);
        // 删除房间

        //roomMapper.deleteByPrimaryKey(room);


        roomMapper.removeUser(username);
        //RoomDO roomDO = new RoomDO();

        userMapper.deleteByPrimaryKey(username);
    }


    @Override
    public void saveUser(UserDO userDO) {
        userMapper.updateByPrimaryKeySelective(userDO);
    }

    @Override
    public void update(UserUpdateRequest owner) {
        UserDO old = userMapper.selectByPrimaryKey(owner.getUsername());
        old.setName(owner.getName());
        old.setIdcard(owner.getIdcard());
        old.setPassword(owner.getPassword());
        old.setPhone(owner.getPhone());
        userMapper.updateByPrimaryKeySelective(old);
    }

}
