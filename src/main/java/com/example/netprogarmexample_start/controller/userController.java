package com.example.netprogarmexample_start.controller;

import com.example.netprogarmexample_start.pojo.Student;
import com.example.netprogarmexample_start.pojo.user;
import com.example.netprogarmexample_start.result.CommonResult;
import com.example.netprogarmexample_start.result.PageData;
import com.example.netprogarmexample_start.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 项目名: netProgarmExample_start
 * 文件名: userController
 * 创建者: LZS
 * 创建时间:2024/1/11 19:05
 * 描述:
 **/
@Controller
@RequestMapping("/user")
public class userController {

    @GetMapping
    public CommonResult test(@RequestParam Integer page, @RequestParam Integer limit) {

        Student student = new Student();
        student.setStudentId(1);
        student.setName("李华");
        student.setSex("男");
        student.setBirthday(new Date());
        student.setProvince("四川");
        student.setClassId(1);
        List<Student> data = new ArrayList<>();
        data.add(student);

        PageData pd = new PageData(1,10,1,1,data);
        return new CommonResult(0,"success",pd.getTotalCount(),pd.getData());
    }
}
