package com.njau.service.impl;

import com.njau.repo.mapper.StaffMapper;
import com.njau.repo.pojo.StaffView;
import com.njau.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewServiceImpl implements ViewService {

    @Autowired
    StaffMapper staffMapper;

    @Override
    public List<StaffView> getAll() {
        return staffMapper.selectAll();
    }
}
