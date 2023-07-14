package com.njau.service;

import com.njau.domain.vo.RoomUserVO;
import com.njau.repo.pojo.RoomDO;
import com.njau.repo.pojo.RoomDOKey;
import com.njau.repo.pojo.UserDO;
import com.njau.util.PageRequest;
import com.njau.util.PageResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

/**
 * RoomService
 *
 * @since 2022/04/19.
 */
public interface RoomService {
    List<RoomUserVO> findByZone(int zone);

    PageResult findPage(PageRequest pageQuery);

    RoomDO findByUsername(String username);

    UserDO findByRoom(RoomDOKey roomDOKey);

    PageResult fuzzyQuery(String name);

    RoomDO findRoomByKey(RoomDOKey roomDOKey);

    void addUser(String username, Date date, Integer zone, String roomID);
}
