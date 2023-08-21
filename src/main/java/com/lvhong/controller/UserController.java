package com.lvhong.controller;

import com.lvhong.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 用户信息
 * @author lvhong
 * @date 2023-07-26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUserInfo(){
        userService.insertUserInfo();
        return "已经成功处理";
    }
}
