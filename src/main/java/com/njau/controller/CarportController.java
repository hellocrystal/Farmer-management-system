package com.njau.controller;

import com.njau.domain.vo.CarportVO;
import com.njau.repo.mapper.CarportMapper;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.mapper.UserMapper;
import com.njau.repo.pojo.*;
import com.njau.service.CarportService;
import com.njau.service.RoomService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CarportController {
    @Autowired
    private CarportMapper carportMapper;
    @Autowired
    private CarportService carportService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/allcar")
    public String allcar(Model model, @RequestParam(value = "num", defaultValue = "1") int num) {
        model.addAttribute("carportlist", carportService.findCarport());
        return "carport";
    }

    @RequestMapping("/findcarbyarea")
    public String findCarByArea(Model model, String area) {
        model.addAttribute("carportlist", carportService.findCarportByArea(area));
        return "carport";
    }
    private List<CarportDO> findCarByArea(String area) {
        CarportExample example = new CarportExample();
        example.createCriteria().andZoneIdEqualTo(area);
        return carportMapper.selectByExample(example);
    }
    @RequestMapping("/findcarbystate")
    public String findCarByState(Model model, String state) {
        model.addAttribute("carportlist", carportService.findCarportByState(Byte.valueOf(state)));
        return "carport";
    }

    @RequestMapping("/suresellcar")
    public @ResponseBody boolean suresellcar(int uid, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        CarportExample carportExample = new CarportExample();
        carportExample.createCriteria().andCarportIdEqualTo(uid);
        List<CarportDO> carports = carportMapper.selectByExample(carportExample);
        if (carports.size() != 1) {
            return false;
        }
        CarportDO carport = carports.get(0);
        RoomDO room = roomService.findByUsername(username);
        carport.setRoomId(room.getId());
        carport.setRoomZone(room.getZone());
        carport.setBuytime(new Date());
        carport.setState(Byte.valueOf("1"));
        return carportMapper.updateByPrimaryKey(carport) > 0;

    }
    @RequestMapping("/sellcar")
    public String sellcar(Model model) {
        CarportExample example = new CarportExample();
        example.createCriteria().andStateEqualTo(Byte.valueOf("0"));
        List<CarportDO> list = carportMapper.selectByExample(example);
        int count = list.size();
        model.addAttribute("A", findCarByArea("A"));
        model.addAttribute("B", findCarByArea("B"));
        model.addAttribute("C", findCarByArea("C"));
        model.addAttribute("D", findCarByArea("D"));
        model.addAttribute("count", count);
        return "sellcar";
    }

    @RequestMapping("/ownerbuycar")
    public String ownerBuyCar(Model model) {
        model.addAttribute("A", carportService.findByArea("A"));
        model.addAttribute("B", carportService.findByArea("B"));
        model.addAttribute("C", carportService.findByArea("C"));
        model.addAttribute("D", carportService.findByArea("D"));
        model.addAttribute("count", carportService.findByState("0").size());
        model.addAttribute("duration", "");
        return "ownerbuycar";
    }

    @RequestMapping("/mycarseat")
    public String myCarSeat(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = session.getAttribute("username").toString();
        model.addAttribute("A", carportService.findByArea("A"));
        model.addAttribute("B", carportService.findByArea("B"));
        model.addAttribute("C", carportService.findByArea("C"));
        model.addAttribute("D", carportService.findByArea("D"));
        model.addAttribute("count", carportService.findByState("0").size());
        List<CarportDO> list = carportService.findByUsername(username);
        model.addAttribute("carport1", list);
        return "mycarseat";
    }

//    @RequestMapping("/getCarByUsername")
//    public
}
