package com.example.netprogarmexample_start.controller;

import com.example.netprogarmexample_start.pojo.User;
import com.example.netprogarmexample_start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 项目名: netProgramExample_start
 * 文件名: UserController
 * 创建者: LZS
 * 创建时间:2024/1/6 19:29
 * 描述:
 **/
@Controller
@RequestMapping("/login")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(Model model) {
        User user = userService.login("lzs");
        model.addAttribute("username", user.getUsername());
        return "user"; // 修改为正确的视图名
    }
}
