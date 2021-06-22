package com.linstudy.ttsx.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linstudy.ttsx.entity.TUser;
import com.linstudy.ttsx.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lin.twilight
 * @since 2021-06-21
 */
@Controller
@RequestMapping("/tUser")
public class TUserController {

    //调用 service 方法
    @Autowired
    private TUserService tUserService;

    @PostMapping("/login")
    public String login(String username, String password) {
        // 与 login.html from name属性对应

        // 将html name 与 entity的变量名做比较
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", username);
        wrapper.eq("password", password);
        TUser tUser = tUserService.getOne(wrapper);

        if (tUser == null) {
            return "login";
        } else {
            return "index";
        }
    }
}

