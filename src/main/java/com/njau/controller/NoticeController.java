package com.njau.controller;

import com.njau.repo.mapper.NoticeMapper;
import com.njau.repo.pojo.NoticeDO;
import com.njau.repo.pojo.NoticeExample;
import com.njau.repo.pojo.RoomDO;
import com.njau.repo.pojo.RoomExample;
import com.njau.service.NoticeService;
import com.njau.service.RoomService;
import com.njau.util.SessionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NoticeController {
    @Autowired
    private NoticeMapper noticeMapper;

    @Autowired
    private NoticeService noticeService;


    @RequestMapping("/doread.action")
    public String doRead(int messid) {
        noticeService.setRead(messid);
        return "redirect:unread.action";
    }

    @RequestMapping("/unread.action")
    public String unread(Model model, HttpServletRequest request) {
        String type = "未阅读";
        return getMessageInfo(model, request, type);
    }

    @RequestMapping("/readed.action")
    public String readed(Model model, HttpServletRequest request) {
        String type = "已读";
        return getMessageInfo(model, request, type);
    }

    private String getMessageInfo(Model model, HttpServletRequest request, String type) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria().andUsernameEqualTo(username);
        RoomDO room = roomService.findByUsername(username);
        NoticeExample noticeExample2 = new NoticeExample();
        noticeExample2.createCriteria().andStatusEqualTo(type).andZoneEqualTo(room.getZone()).andRoomIdEqualTo(room.getId());
        List<NoticeDO> list = noticeMapper.selectByExample(noticeExample2);
        if (list.size() < 1) {
            model.addAttribute("nomess", "暂无通知");
        }
        model.addAttribute("type", type);
        model.addAttribute("readlist", list);
        return "messinfo";
    }

    @Autowired
    private RoomService roomService;

    @RequestMapping("/showMessNum")
    public @ResponseBody List<String> showMessNum(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username == null || username.length() == 0) {
            return new ArrayList<>();
        }
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria().andUsernameEqualTo(username);
        RoomDO room = roomService.findByUsername(username);

        NoticeExample noticeExample1 = new NoticeExample();
        NoticeExample noticeExample2 = new NoticeExample();

        noticeExample1.createCriteria().andZoneEqualTo(room.getZone()).andRoomIdEqualTo(room.getId());
        noticeExample2.createCriteria().andStatusEqualTo("未阅读").andZoneEqualTo(room.getZone()).andRoomIdEqualTo(room.getId());
        String a = "我的通知" + noticeMapper.countByExample(noticeExample1);
        String b = "未读" + noticeMapper.countByExample(noticeExample2);
        List<String> list2 = new ArrayList<>();
        list2.add(a);
        list2.add(b);
        return list2;
    }

    @PostMapping("/cuikuan.action")
    public @ResponseBody String pressPayment(@RequestParam("username") String username, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String message = "请您及时缴纳相关费用，详情请到我的账单查看";
        String sender = session.getAttribute(SessionEnum.USERNAME).toString();
        System.out.println(sender);
        System.out.println(username);
        noticeService.sendMessage(sender, username, message);
        return "success";
    }
}

