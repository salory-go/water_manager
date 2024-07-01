package com.example.netprogarmexample_start.mapper;

import com.example.netprogarmexample_start.pojo.DLXX;
import com.example.netprogarmexample_start.pojo.VO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 项目名: netProgarmExample_start
 * 文件名: DLXXMapper
 * 创建者: LZS
 * 创建时间:2024/1/11 21:17
 * 描述:
 **/
@Mapper
public interface DLXXMapper {

    @Select("select * from czdlxxb")
    public List<DLXX> getAll();

    public List<VO> get();
}
