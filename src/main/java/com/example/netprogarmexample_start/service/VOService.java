package com.example.netprogarmexample_start.service;

import com.example.netprogarmexample_start.mapper.CZYLMapper;
import com.example.netprogarmexample_start.mapper.DLXXMapper;
import com.example.netprogarmexample_start.pojo.CZYL;
import com.example.netprogarmexample_start.pojo.DLXX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名: netProgarmExample_start
 * 文件名: VOService
 * 创建者: LZS
 * 创建时间:2024/1/11 21:03
 * 描述:
 **/
@Service
public class VOService {
    @Autowired
    CZYLMapper czylMapper;
    @Autowired
    DLXXMapper dlxxMapper;

    public List<CZYL> getAllCZYL(){
        return czylMapper.getAllCYZL();
    }

    public List<DLXX> getAllDLXX(){return  dlxxMapper.getAll();}
}
