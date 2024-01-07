package com.example.netprogarmexample_start.exception;

/**
 * 项目名: netProgramExample_start
 * 文件名: baseException
 * 创建者: LZS
 * 创建时间:2024/1/6 21:33
 * 描述:
 **/
public class BaseException extends RuntimeException{
    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }
}
