package com.linstudy.ttsx.controller;


import com.linstudy.ttsx.service.GoodscategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lin.twilight
 * @since 2021-06-21
 */
@Controller
@RequestMapping("//goodscategory")
public class GoodscategoryController {
    @Autowired
    private GoodscategoryService goodscategoryService;


}

