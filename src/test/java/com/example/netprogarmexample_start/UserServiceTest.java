package com.example.netprogarmexample_start;

import com.example.netprogarmexample_start.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    UserService userService;
    @Test
    void testLogin(){
        String username1 = "lzs";
        String username2 = "zxr";
        System.out.println("username1's result is "+userService.login(username1));
        System.out.println("username2's result is "+userService.login(username2));
    }
}
