package com.njau.controller;

import com.njau.domain.query.ComplainRequest;
import com.njau.domain.vo.ComplainVO;
import com.njau.repo.mapper.ComplainMapper;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.pojo.*;
import com.njau.service.ComplainService;
import com.njau.service.RoomService;
import com.njau.service.StaffService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ComplainController {
    @Autowired
    ComplainMapper complainMapper;

    @Autowired
    ComplainService complainService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomMapper roomMapper;

    @RequestMapping("/complain")
    public String complain(Model model) {
        List<ComplainDO> list = complainMapper.selectByExample(new ComplainExample());
        model.addAttribute("complainlist", complainService.findAll());
        return "complain";
    }

    @RequestMapping("/complainstate")
    public String complainState(Model model, String state) {
        model.addAttribute("complainlist", complainService.findByState(Byte.valueOf(state)));
        return "complain";
    }

    //职工点击处理按钮调用
    @GetMapping("/complainHandle")
    public String complainHandle(@RequestParam("id") Integer id, HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        String username = session.getAttribute("username").toString();
        complainService.setStateAndTimeById(id, username, new Date());
        model.addAttribute("complainlist", complainService.findAll());
        return "complain";
    }

    @RequestMapping("/addcomplaint")
    public String addComplaint() {
        return "addonecomplain";
    }

    @RequestMapping("/savecomplain")
    public String savecComplain(ComplainRequest request, HttpServletRequest httpRequest) {
        HttpSession session = httpRequest.getSession();
        ComplainDO complainDO = new ComplainDO();
        complainDO.setContent(request.getContent());
        complainDO.setType(request.getType());
        complainDO.setSubmitTime(new Date());
        complainDO.setState((byte) 0);
        String username = session.getAttribute("username").toString();
        RoomDO room = roomService.findByUsername(username);
        complainDO.setRoomId(room.getId());
        complainDO.setZone(room.getZone());
        complainMapper.insertSelective(complainDO);
        return "addonecomplain";
    }

    @RequestMapping("/mycomplaint")
    public String mycomplaint(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = session.getAttribute("username").toString();
        model.addAttribute("mycomplaintlist", complainService.findByUsername(username));
        return "mycomplaint";
    }
}
