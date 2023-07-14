package com.njau.service;

import com.njau.domain.vo.ComplainVO;
import com.njau.repo.pojo.RoomDO;

import java.util.Date;
import java.util.List;


/**
 * ComplainService
 *
 * @since 2022/04/23.
 */
public interface ComplainService {
    void deleteByRoom(RoomDO room);

    List<ComplainVO> findByUsername(String username);
    List<ComplainVO> findByState(Byte state);
    List<ComplainVO> findAll();

    Boolean setStateAndTimeById(Integer id, String staffUsername, Date handleTime);
}
