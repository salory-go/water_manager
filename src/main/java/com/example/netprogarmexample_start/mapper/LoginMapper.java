package com.example.netprogarmexample_start.mapper;

import com.example.netprogarmexample_start.pojo.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("select * from administrator where username = #{username} and password = #{password}")
    Administrator getByUsernameAndPassword(Administrator adm);

}
