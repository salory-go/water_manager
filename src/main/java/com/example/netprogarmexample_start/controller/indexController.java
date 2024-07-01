package com.example.netprogarmexample_start.controller;

import com.example.netprogarmexample_start.mapper.IMapper;
import com.example.netprogarmexample_start.pojo.CZ;
import com.example.netprogarmexample_start.pojo.HL;
import com.example.netprogarmexample_start.pojo.VO;
import com.example.netprogarmexample_start.pojo.ZF;
import com.example.netprogarmexample_start.result.Result;
import com.example.netprogarmexample_start.service.VOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名: netProgarmExample_start
 * 文件名: indexController
 * 创建者: LZS
 * 创建时间:2024/1/11 19:19
 * 描述:
 **/
@Controller
@RequestMapping("/")
public class indexController {

    @Autowired
    VOService service;
    @Autowired
    IMapper mapper;

    @GetMapping("/CZ")
    @ResponseBody
    public List<CZ> test1(){
//        System.out.println(mapper.getCZ());
        return mapper.getCZ();
    }

    @DeleteMapping("/CZ/{code}")
    @ResponseBody
    public Result delete(@PathVariable String code){
        System.out.println(code.getClass());
        System.out.println(mapper.delete(code));
        return new Result("200",null,null);
    }

    @GetMapping("/HL")
    @ResponseBody
    public List<HL> test2(){
        System.out.println(mapper.getHL());
        return mapper.getHL();
    }

    @GetMapping("/ZF")
    @ResponseBody
    public List<ZF> test3(){
        System.out.println(mapper.getZF());
        return mapper.getZF();
    }

    @PostMapping("/CZ")
    @ResponseBody
    public Result update(@RequestBody CZ cz){
        System.out.println(cz);
        System.out.println(mapper.updateCZ1(cz));
        System.out.println(mapper.updateCZ2(cz));
        System.out.println(mapper.updateCZ3(cz));
        return new Result("200",null,null);
    }

    @PostMapping("/CZ/add")
    @ResponseBody
    public Result add(@RequestBody CZ cz){
        System.out.println(cz);
        System.out.println(mapper.addCZ1(cz));
        System.out.println(mapper.addCZ2(cz));
        System.out.println(mapper.addCZ3(cz));
        System.out.println(mapper.addCZ4(cz));


        return new Result("200",null,null);
    }
}
