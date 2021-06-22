package com.linstudy.ttsx.controller;


import com.linstudy.ttsx.service.GoodscategoryService;
import com.linstudy.ttsx.service.GoodsinfoService;
import com.linstudy.ttsx.vo.DataVO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lin.twilight
 * @since 2021-06-21
 */
//@Controller
@RestController
//@RequestMapping("//goodsinfo")
public class GoodsinfoController {

//    @Autowired
//    private GoodscategoryService goodscategoryService;

    @Autowired
    private GoodsinfoService goodsinfoService;

    @GetMapping("/list")
    public DataVO list(){
        return goodsinfoService.findData();
    }
//    @GetMapping("/list/{type}/{id}")
//    public ModelAndView list(
//            @PathVariable("type") String type,
//            @PathVariable("id") Integer id,
//            HttpSession session
//    ) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("goodsinfoList");
//        modelAndView.addObject("goodsinfoList",goodsinfoService.findByGoodsCagId(type,id));
//        modelAndView.addObject("list",goodscategoryService.getAllGoodscategoryVO());
//        User user = (User)session.getAttribute("user");
//        if(user == null){
//            modelAndView.addObject("cartList",new ArrayList<>());
//        }else{
//            modelAndView.addObject("cartList",cartService.findAllCartVOByUserId(user.getId()));;
//        }
//        return modelAndView;
//    }

    // 后端

}

