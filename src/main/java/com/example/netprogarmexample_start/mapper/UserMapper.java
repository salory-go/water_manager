package com.example.netprogarmexample_start.mapper;

import com.example.netprogarmexample_start.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 项目名: netProgramExample_start
 * 文件名: UserMapper
 * 创建者: LZS
 * 创建时间:2024/1/6 17:44
 * 描述:
 **/
@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    User getUser(String username);
}
