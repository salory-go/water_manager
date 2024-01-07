package com.example.netprogarmexample_start.pojo;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * 项目名: netProgramExample_start
 * 文件名: User
 * 创建者: LZS
 * 创建时间:2024/1/6 17:39
 * 描述:
 **/
@Data
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
