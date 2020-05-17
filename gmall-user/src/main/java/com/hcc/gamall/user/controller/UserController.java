package com.hcc.gamall.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author java123_chuangchuang
 * @create 2020-05-17 21:13
 */
@Controller
public class UserController {
    @RequestMapping("getAllUserlist")
    @ResponseBody
    public String getUserList(){
        return "hello";
    }
}
