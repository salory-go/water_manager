package com.example.netprogarmexample_start.result;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

/**
 * 项目名: netProgarmExample_start
 * 文件名: Result
 * 创建者: LZS
 * 创建时间:2024/1/7 15:13
 * 描述:
 **/
@Data
public class Result<T> implements Serializable {
    private String code;
    private String msg;
    private T data;

    public Result() {
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
