package com.njau.service.impl;

import com.njau.repo.mapper.NoticeMapper;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.pojo.NoticeDO;
import com.njau.repo.pojo.NoticeExample;
import com.njau.repo.pojo.RoomDO;
import com.njau.repo.pojo.RoomExample;
import com.njau.service.NoticeService;
import com.njau.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * NoticeServiceImpl
 *
 * @since 2022/04/19.
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<NoticeDO> selectByUsername(String username) {
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria().andUsernameEqualTo(username);
        List<RoomDO> rooms = roomMapper.selectByExample(roomExample);
        NoticeExample noticeExample = new NoticeExample();
        for (RoomDO room : rooms) {
            noticeExample.or().andZoneEqualTo(room.getZone()).andRoomIdEqualTo(room.getId());
        }
        return noticeMapper.selectByExample(noticeExample);
    }

    @Override
    public void deleteByRoom(RoomDO room) {

        NoticeExample example = new NoticeExample();
        example.createCriteria().andRoomIdEqualTo(room.getId()).andZoneEqualTo(room.getZone());
        noticeMapper.deleteByExample(example);
    }


    @Autowired
    private RoomService roomService;

    @Override
    public void sendMessage(String sender, String receiver, String message) {
        RoomDO room = roomService.findByUsername(receiver);
        NoticeDO noticeDo = new NoticeDO();
        noticeDo.setZone(room.getZone());
        noticeDo.setRoomId(room.getId());
        noticeDo.setStatus("未阅读");
        noticeDo.setTime(new Date());
        noticeDo.setContent(message);
        noticeDo.setStaffUsername(sender);
        noticeMapper.insert(noticeDo);
    }

    @Override
    public void setRead(int messid) {
        NoticeDO noticeDo = noticeMapper.selectByPrimaryKey(messid);
        noticeDo.setStatus("已读");
        noticeMapper.updateByPrimaryKey(noticeDo);
    }
}
