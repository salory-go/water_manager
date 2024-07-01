package com.example.netprogarmexample_start.controller;

import com.example.netprogarmexample_start.pojo.Administrator;
import com.example.netprogarmexample_start.result.CommonResult;
import com.example.netprogarmexample_start.service.LoginService;
import com.example.netprogarmexample_start.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody Administrator admin) {

        Administrator e = loginService.login(admin);

        //登录成功，则生成令牌并下发令牌
        if (e != null) {
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", e.getId());
            claims.put("username", e.getUsername());
            String jwt = JwtUtils.generateJwt(claims);
            return CommonResult.success(1, jwt);
        }

        //登录失败，则返回错误信息
        return CommonResult.fail();

    }

}
