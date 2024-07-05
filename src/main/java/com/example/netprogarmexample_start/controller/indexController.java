package com.example.netprogarmexample_start.controller;

import com.example.netprogarmexample_start.mapper.IMapper;
import com.example.netprogarmexample_start.pojo.*;
import com.example.netprogarmexample_start.result.Result;
import com.example.netprogarmexample_start.service.VOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

    // 测站

    @GetMapping("/CZ")
    @ResponseBody
    public List<CZ> getCZs() {
        return mapper.getCZ();
    }

    @GetMapping("/CZGL")
    @ResponseBody
    public List<CZGL> getCZGLs() {
        List<CZGL> list = mapper.getCZGL();
        for (CZGL czgl : list) {
            String STCD = czgl.getSTCD();
            String name = mapper.getCZByCD(STCD);
            czgl.setSTNM(name);
        }
        return list;
    }

    @DeleteMapping("/CZ/{code}")
    @ResponseBody
    @Transactional
    public Result delete(@PathVariable String code) {
        System.out.println(mapper.delete1(code));
        System.out.println(mapper.delete2(code));
        System.out.println(mapper.delete3(code));
        System.out.println(mapper.delete4(code));
        return new Result("200", null, null);
    }

    @PostMapping("/CZ")
    @ResponseBody
    @Transactional
    public Result update(@RequestBody CZ cz){
        System.out.println(cz);
        System.out.println("修改");
        System.out.println(mapper.updateCZ1(cz));
        System.out.println(mapper.updateCZ2(cz));
        System.out.println(mapper.updateCZ3(cz));
        return new Result("200",null,null);
    }

    @PostMapping("/CZGL")
    @ResponseBody
    @Transactional
    public Result updateGL(@RequestBody CZGL czgl){
        System.out.println(czgl);
        System.out.println("修改");
        System.out.println(mapper.updateCZGL1(czgl));
        System.out.println(mapper.updateCZGL2(czgl));
        return new Result("200",null,null);
    }

    @PostMapping("/CZ/add")
    @ResponseBody
    @Transactional
    public Result add(@RequestBody CZ cz) {
        System.out.println(cz);
        System.out.println("添加");
        System.out.println(mapper.addCZ1(cz));
        System.out.println(mapper.addCZ2(cz));
        System.out.println(mapper.addCZ3(cz));
        System.out.println(mapper.addCZ4(cz));
        return new Result("200", null, null);

}

    @GetMapping("/CZAll/{code}")
    @ResponseBody
    public Result getCZAll(@PathVariable String code) {
        CZAll czAll = mapper.getCZAllByCD(code);
        System.out.println(czAll);
        return new Result("200", null, czAll);
    }

    // 河流

    @GetMapping("/HL")
    @ResponseBody
    public List<HL> getHLs(){
        return mapper.getHL();
    }

    @GetMapping("/ZF")
    @ResponseBody
    public List<ZF> getZFs(){
        return mapper.getZF();
    }

}
