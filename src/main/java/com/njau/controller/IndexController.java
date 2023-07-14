package com.njau.controller;

import com.njau.util.Captcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping({"/index", "/"})
    public String index() {
        return "login";
    }

    @RequestMapping("/company")
    public String company() {
        return "company";
    }

    @RequestMapping("/captcha")
    public void getCaptcha(HttpServletResponse response, HttpSession session) {
        try {
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
            response.setContentType("image/jpeg");

            OutputStream os = response.getOutputStream();
            // 返回验证码和图片的map
            Map<String, Object> map = Captcha.getImageCode(86, 37, os);
            String simpleCaptcha = "simpleCaptcha";
            session.setAttribute(simpleCaptcha, map.get("strEnsure").toString().toLowerCase());
            session.setAttribute("codeTime", System.currentTimeMillis());
            ImageIO.write((BufferedImage) map.get("image"), "jpg", os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
