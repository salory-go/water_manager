package com.example.netprogarmexample_start;

import com.example.netprogarmexample_start.mapper.IMapper;
import com.example.netprogarmexample_start.pojo.CZ;
import com.example.netprogarmexample_start.pojo.CZGL;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 项目名: netProgarmExample_start
 * 文件名: UserServiceTest
 * 创建者: LZS
 * 创建时间:2024/1/6 17:49
 * 描述:
 **/
@SpringBootTest
public class UserServiceTest {
    @Autowired
    IMapper mapper;

    @Test
    public void test(){
        List<CZGL> list = mapper.getCZGL();
        for (CZGL czgl : list) {
            String STCD = czgl.getSTCD();
            String name = mapper.getCZByCD(STCD);
            czgl.setSTNM(name);
        }
        System.out.println(list);
    }

    @Test
    public void test1(){
        CZ test = new CZ();
        test.setWaterName("12341226");
        test.setRiverName("河海河");
        test.setWaterField("");
//        mapper.addCZ1(test);
    }
}
