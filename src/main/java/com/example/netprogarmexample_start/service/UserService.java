package com.example.netprogarmexample_start.service;

import com.example.netprogarmexample_start.exception.NoUserException;
import com.example.netprogarmexample_start.mapper.UserMapper;
import com.example.netprogarmexample_start.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 项目名: netProgramExample_start
 * 文件名: UserService
 * 创建者: LZS
 * 创建时间:2024/1/6 17:47
 * 描述:
 **/
@Service
@Slf4j
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User login(String username){
        log.info("UserService is running...");
        User user = userMapper.getUser(username);
        if(user!=null)
        {
            log.info("it has the certain user...");
            log.info("UserService is stopping...");
            return user;
        }

        else{
            log.error("it doesn't have user... ");
            log.info("UserService is stopping...");
            throw new NoUserException("There is no user named "+username);
        }
    }
}
