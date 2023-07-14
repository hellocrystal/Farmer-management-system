package com.njau.service;

import com.njau.repo.pojo.NoticeDO;
import com.njau.repo.pojo.RoomDO;

import java.util.List;

/**
 * NoticeService
 *
 * @since 2022/04/19.
 */
public interface NoticeService {
    List<NoticeDO> selectByUsername(String username);

    void deleteByRoom(RoomDO room);

    void sendMessage(String sender, String receiver, String message);

    void setRead(int messid);
}
