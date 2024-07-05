package com.example.netprogarmexample_start.controller;

import com.example.netprogarmexample_start.pojo.Administrator;
import com.example.netprogarmexample_start.pojo.Jurisdiction;
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
            //生成JWT令牌
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", e.getId());
            claims.put("username", e.getUsername());
            String jwt = JwtUtils.generateJwt(claims);
            //生成权限包装对象
            Jurisdiction jurisdiction = new Jurisdiction();
            jurisdiction.setName(e.getUsername());
            jurisdiction.setLevel(e.getLevel());
            jurisdiction.setJwt(jwt);
            //返回权限包装对象
            return CommonResult.success(1, jurisdiction);
        }

        //登录失败，则返回错误信息
        return CommonResult.fail();

    }

}
