package com.njau.controller;

import com.njau.repo.pojo.StaffView;
import com.njau.service.ViewService;
import com.njau.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

    @Autowired
    ViewService viewService;

    @RequestMapping("/findpage")
    String staffView(Model model) {
        ///System.out.println("test....");
        //model.addAttribute(viewService.getAll());
        PageResult pr = new PageResult();
        pr.setContent(viewService.getAll());
        model.addAttribute("pageResult", pr);
        return "clerklist";
    }

}
