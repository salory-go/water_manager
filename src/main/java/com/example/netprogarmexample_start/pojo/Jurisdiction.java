package com.example.netprogarmexample_start.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//用户权限包装对象
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jurisdiction {
    private Integer level;  //用户权限等级
    private String jwt; //JWT令牌
    private String name;
}
