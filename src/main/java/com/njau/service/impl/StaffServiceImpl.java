package com.njau.service.impl;

import com.njau.domain.query.StaffAddRequest;
import com.njau.domain.vo.StaffVO;
import com.njau.repo.mapper.DepartmentMapper;
import com.njau.repo.mapper.StaffMapper;
import com.njau.repo.mapper.UserMapper;
import com.njau.repo.pojo.DepartmentDO;
import com.njau.repo.pojo.StaffDO;
import com.njau.repo.pojo.StaffExample;
import com.njau.repo.pojo.UserDO;
import com.njau.service.StaffService;
import com.njau.util.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * StaffServiceImpl
 *
 * @since 2022/04/20.
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffMapper staffMapper;
    @Autowired
    UserMapper userMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public PageResult findByName(String str) {
        // 找出所有staff
        List<StaffDO> staffs = staffMapper.selectByExample(new StaffExample());
        List<StaffVO> staffVOS = new ArrayList<>();
        for (StaffDO staff : staffs) {
            StaffVO vo = new StaffVO();
            UserDO userDo = userMapper.selectByPrimaryKey(staff.getUsername());
            BeanUtils.copyProperties(staff, vo);
            BeanUtils.copyProperties(userDo, vo);
            DepartmentDO department = departmentMapper.selectByPrimaryKey(staff.getDno());
            vo.setDepartment(department.getDeptName());
            staffVOS.add(vo);
        }
        // 关联到user
        // 过滤
        PageResult pr = new PageResult();
        pr.setContent(staffVOS);
        return pr;
    }

    @Override
    public DepartmentDO findDepartmentByUsername(String username) {
        StaffDO staff = staffMapper.selectByPrimaryKey(username);
        return departmentMapper.selectByPrimaryKey(staff.getDno());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean add(StaffAddRequest clerk) throws ParseException {
        // 创建用户

        UserDO userDo = new UserDO();
        userDo.setName(clerk.getName());
        userDo.setPassword(clerk.getPassword());
        userDo.setPhone(clerk.getPhone());
        userDo.setUsername(clerk.getUsername());
        userDo.setSex(clerk.getSex());
        userDo.setRegistTime(new Date());
        userMapper.insertSelective(userDo);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:MM");

        StaffDO staffDo = new StaffDO();
        staffDo.setUsername(userDo.getUsername());
        staffDo.setOfficetime(simpleDateFormat.parse(clerk.getOfficeTime()));
        staffDo.setQuittime(simpleDateFormat.parse(clerk.getQuitTime()));
        staffDo.setDno(clerk.getDno());
        staffDo.setBonus(clerk.getBonus());
        staffDo.setSalary(clerk.getSalary());
        staffMapper.insert(staffDo);
        return false;
    }

    @Override
    public StaffDO getByUsername(String username) {
        return staffMapper.selectByPrimaryKey(username);
    }
}
