package com.njau.service;

import com.njau.domain.query.UserRegisterRequest;
import com.njau.domain.query.UserUpdateRequest;
import com.njau.domain.vo.RoomUserVO;
import com.njau.repo.pojo.UserDO;
import com.njau.util.PageRequest;
import com.njau.util.PageResult;

import java.util.List;

/**
 * UserService
 *
 * @since 2022/04/19.
 */
public interface UserService {

    UserDO findByPhone(String otel);

    UserDO findByUsername(String username);

    List<RoomUserVO> findByZone(int towernum);
    List<RoomUserVO> findAll();

    PageResult findPage(PageRequest pageQuery);

    String addUser(UserRegisterRequest record);

    void deleteByUsername(String username);

    void saveUser(UserDO userDO);

    void update(UserUpdateRequest owner);

}
