package com.njau.service;

import com.njau.repo.mapper.StaffMapper;
import com.njau.repo.pojo.StaffView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.List;


public interface ViewService {
    List<StaffView> getAll();
}
