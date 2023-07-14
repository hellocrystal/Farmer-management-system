package com.njau.controller;

import com.njau.domain.query.StaffAddRequest;
import com.njau.repo.mapper.DepartmentMapper;
import com.njau.repo.pojo.DepartmentExample;
import com.njau.service.StaffService;
import com.njau.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;
    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("/clerkadd")
    public String staffAddPage(Model model) {
        model.addAttribute("departments", departmentMapper.selectByExample(new DepartmentExample()));
        return "clerkadd";
    }

    @RequestMapping("/clerkaddsave")
    public String staffAdd(StaffAddRequest clerk) throws ParseException {
        staffService.add(clerk);
        return "redirect:findpage.action";
    }

    @RequestMapping("/findpage_old")
    public String findPage(Model model, String str) {
        PageResult pageResult = staffService.findByName(str);
        model.addAttribute("pageResult", pageResult);
        return "clerklist";
    }
}
