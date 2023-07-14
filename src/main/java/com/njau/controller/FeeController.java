package com.njau.controller;

import com.njau.domain.vo.UserBillVO;
import com.njau.repo.mapper.FeeItemMapper;
import com.njau.repo.mapper.UserMapper;
import com.njau.repo.pojo.FeeItemDO;
import com.njau.repo.pojo.FeeItemExample;
import com.njau.repo.pojo.UserDO;
import com.njau.repo.pojo.UserExample;
import com.njau.service.BillService;
import com.njau.service.FeeService;
import com.njau.util.SessionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FeeController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private FeeService feeService;
    @Autowired
    private FeeItemMapper feeItemMapper;
    @Autowired
    private BillService billService;

    @RequestMapping("/sfmanage")
    public String shoufeiguanli(Model model) {
        List<FeeItemDO> list = feeItemMapper.selectByExample(new FeeItemExample());
        model.addAttribute("list", list);
        return "sfmanage";
    }

    @RequestMapping("/addbillitem")
    public String addbillitem(FeeItemDO billitem, HttpServletRequest request) {
        // 判断添加的收费项目是否为一次性收费
        HttpSession session = request.getSession();
        String username = session.getAttribute(SessionEnum.USERNAME).toString();
        // 添加到数据库
        feeService.addFeeItem(username, billitem);
        return "redirect:sfmanage.action";
    }

    @RequestMapping("/unpayfy")
    public String unpayfy(Model model) {
        List<UserBillVO> list = billService.listUnPayUser();
        model.addAttribute("list", list);
        return "unpay";
    }

    @RequestMapping("/mybill")
    public String mybill(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        UserDO userDo = userMapper.selectByPrimaryKey(username);
        UserBillVO userBillVO = billService.findUserBillByUsernameAndStatus(userDo, "0");
        model.addAttribute("owner", userBillVO);
        return "mybill";
    }

    @RequestMapping("/mybillpay")
    public String mybillpay(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        UserDO userDo = userMapper.selectByPrimaryKey(username);
        UserBillVO userBillVO = billService.findUserBillByUsernameAndStatus(userDo, "1");
        model.addAttribute("owner", userBillVO);
        return "mybillpay";
    }

    @PostMapping("/payMyBill")
    public String payMyBill(@RequestParam("ids") List<Integer> ids, HttpServletRequest request, Model model) {
        for (Integer id : ids) {
            feeService.payFee(id);
        }
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        UserDO userDo = userMapper.selectByPrimaryKey(username);
        UserBillVO userBillVO = billService.findUserBillByUsernameAndStatus(userDo, "0");
        model.addAttribute("owner", userBillVO);
        return "mybill";
    }
}
