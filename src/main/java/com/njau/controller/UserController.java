package com.njau.controller;

import com.njau.domain.query.UserRegisterRequest;
import com.njau.domain.query.UserUpdateRequest;
import com.njau.domain.vo.RoomUserVO;
import com.njau.repo.mapper.RoomMapper;
import com.njau.repo.pojo.NoticeDO;
import com.njau.repo.pojo.RoomDO;
import com.njau.repo.pojo.RoomDOKey;
import com.njau.repo.pojo.UserDO;
import com.njau.service.NoticeService;
import com.njau.service.RoomService;
import com.njau.service.StaffService;
import com.njau.service.UserService;
import com.njau.util.PageRequest;
import com.njau.util.PageResult;
import com.njau.util.SessionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private RoomService roomService;


    @Autowired
    private StaffService staffService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/signin")
    public String signin() {
        return "regist";
    }

    @RequestMapping("/signinjudge")
    public String signInJudge(UserRegisterRequest record, HttpServletRequest request, Model model) {
       String msg = userService.addUser(record);
        HttpSession session = request.getSession();
        if (session.getAttribute(SessionEnum.USERNAME) != null) {
            return "redirect:findpagess.action?pageSize=5&pageNum=1&str=n";
        }
        if ("success".equals(msg)) {
            return "redirect:login";
        } else {
            model.addAttribute("msg", msg);
            return "regist";
        }
    }

    @RequestMapping("/checkUserName")
    public @ResponseBody String checkUserName(HttpServletRequest request) {
        String username = request.getParameter("username");
        UserDO user = userService.findByUsername(username);
        return String.valueOf(user == null);
    }

    /**
     * 退出控制器
     */
    @RequestMapping("/exit")
    public String exit(HttpServletRequest request) {
        // 获取当前的session
        HttpSession session1 = request.getSession();
        // 销毁session
        session1.invalidate();
        return "redirect:login.action";
    }

    @RequestMapping("/save")
    public String save(UserUpdateRequest owner, Model model) {
        userService.update(owner);
        return "redirect:findpagess.action?pageSize=5&pageNum=1&str=n";
    }

    @RequestMapping("/deleteone")
    public String deleteone(String oid) {
        userService.deleteByUsername(oid);
        return "redirect:findpagess.action?pageSize=5&pageNum=1&str=n";
    }

    @RequestMapping("/loginjudge")
    public String loginJudge(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpServletRequest request, String captcha) {
        String session1 = String.valueOf(request.getSession().getAttribute("simpleCaptcha"));
        if (captcha.equals(session1)) {
            UserDO owner = userService.findByUsername(username);
            if (owner != null && owner.getPassword().equals(password)) {
                HttpSession session = request.getSession();
                session.setAttribute("currentOwnerr", owner);
                session.setAttribute("username", owner.getUsername());
                session.setAttribute("owneruid", owner.getUsername());
                session.setAttribute("tel", owner.getPhone());
                if (staffService.getByUsername(username) != null) {  //不能把admin写死
                    return "main";
                } else {
                    List<NoticeDO> list = noticeService.selectByUsername(owner.getUsername());
                    int messnumber = 0;
                    for (NoticeDO message : list) {
                        if ("未阅读".equals(message.getStatus())) {
                            ++messnumber;
                        }
                    }
                    model.addAttribute("messnumber", messnumber); //未阅读的消息数量
                    request.setAttribute("msss", "");
                    return "ownermain";
                }

            } else {
                // 将如错误信息发送到作用域，重定向在登录页面
                request.setAttribute("msss", "用户名已存在或者密码错误");
                return "login";
            }
        } else {
            request.setAttribute("msss", "验证码错误！");
            return "login";
        }
    }

    /**
     * 展示用户
     */
    @RequestMapping("/showoerme")
    public String showownerme(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String oid1 = (String) session.getAttribute("username");
        if (oid1 != null && oid1.length() > 0) {
            UserDO onwer = userService.findByUsername(oid1);
            model.addAttribute("onwer", onwer);
            model.addAttribute("room", roomService.findByUsername(onwer.getUsername()));
            return "showoerme";
        } else {
            return "login";
        }
    }

    @RequestMapping("/mymianmessage")
    public String mymianmessage() {
        return "mymianmessage";
    }

    @RequestMapping("/updateowenerss")
    public String updateowenerss(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String oid1 = (String) session.getAttribute("username");
        UserDO owner = userService.findByUsername(oid1);
        model.addAttribute("owner", owner);
        return "updateowner";
    }

    @RequestMapping("/savaowners")
    public String savaowners(Model model, HttpServletRequest request, UserUpdateRequest userUpdateRequest) {
        HttpSession session = request.getSession();
        // 获取当前的
        String username = (String) session.getAttribute("username");
        UserDO userDo = userService.findByUsername(username);
        userDo.setName(userUpdateRequest.getName());
        userDo.setPassword(userUpdateRequest.getPassword());
        userDo.setIdcard(userUpdateRequest.getIdcard());
        userDo.setPhone(userUpdateRequest.getPhone());
        userService.saveUser(userDo);
        UserDO newUser = userService.findByUsername(username);
        model.addAttribute("onwer", newUser);
        model.addAttribute("room", roomService.findByUsername(newUser.getUsername()));
        return "showoerme";
    }

    @RequestMapping("/findpagess")
    public String findPage(int pageSize, int pageNum, Model model, String str, HttpSession session) {
        if (str.equals("z")) {
            ++pageNum;
        } else if (str.equals("j")) {
            --pageNum;
        }
        session.setAttribute("pageSize", pageSize);
        PageRequest pageQuery = new PageRequest();
        pageQuery.setPageNum(pageNum);
        pageQuery.setPageSize(pageSize);
        PageResult pageResult = roomService.findPage(pageQuery);

        model.addAttribute("pageResult", pageResult);
        return "customer";
    }

    /**
     * 分类查询住户集合
     */
    @RequestMapping("list2")
    public String ownerlist2(Model model, int towernum) {
        List<RoomUserVO> list = userService.findByZone(towernum);
        model.addAttribute("list", list);
        return "list2";
    }


    @PostMapping("/fuzzyQuery")
    public String fuzzyQuery(@RequestParam("name") String name, Model model) {
        name = name.trim();
        if(name.length() == 0) name = null;
        PageResult pageResult = roomService.fuzzyQuery(name);
        model.addAttribute("pageResult", pageResult);
        return "customer";
    }

//
//    @Autowired
//    private RoomMapper roomMapper;
//
//    @ResponseBody
//    @RequestMapping("/test_add")
//    String testAdd() {
//        Random random = new Random();
//        for(int i = 1;i <= 10;i ++) {
//            for(int j = 1;j <= 10;j ++) {
//                for(int k = 1;k <= 10;k ++) {
//                    String id = String.valueOf(j);
//                    if(k < 10) id = id + "0" + String.valueOf(k);
//                    else id = id + String.valueOf(k);
//                    //System.out.println(String.valueOf(i) + ":" + id);
//                    RoomDO roomDO = new RoomDO();
//                    roomDO.setZone(i);
//                    roomDO.setId(id);
//                    roomDO.setArea(28 + random.nextInt(45 - 28));
//                    roomDO.setFloor(j);
//                    roomDO.setUsername(null);
//                    roomDO.setTime(null);
//                    RoomDOKey roomDOKey = new RoomDOKey(i, id);
//                    if(roomMapper.selectByPrimaryKey(roomDOKey) != null) continue;
//                    int rows = roomMapper.insert(roomDO);
//                    System.out.println(rows);
//                }
//            }
//        }
//        return "success";
//    }

}
