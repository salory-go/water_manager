package com.example.netprogarmexample_start.service;

import com.example.netprogarmexample_start.mapper.LoginMapper;
import com.example.netprogarmexample_start.pojo.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    public Administrator login(Administrator admin) {

        return loginMapper.getByUsernameAndPassword(admin);

    }

}
