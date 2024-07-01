package com.example.netprogarmexample_start.mapper;

import com.example.netprogarmexample_start.pojo.CZYL;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 项目名: netProgarmExample_start
 * 文件名: CZYLMapper
 * 创建者: LZS
 * 创建时间:2024/1/11 21:04
 * 描述:
 **/
@Mapper
public interface CZYLMapper {
    @Select("select * from czylb ")
    public List<CZYL> getAllCYZL();
}
