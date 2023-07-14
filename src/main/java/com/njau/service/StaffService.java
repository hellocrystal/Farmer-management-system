package com.njau.service;

import com.njau.domain.query.StaffAddRequest;
import com.njau.repo.pojo.DepartmentDO;
import com.njau.repo.pojo.StaffDO;
import com.njau.util.PageResult;

import java.text.ParseException;

/**
 * StaffService
 *
 * @since 2022/04/20.
 */
public interface StaffService {
    PageResult findByName(String str);

    DepartmentDO findDepartmentByUsername(String username);

    boolean add(StaffAddRequest clerk) throws ParseException;

    StaffDO getByUsername(String username);
}
