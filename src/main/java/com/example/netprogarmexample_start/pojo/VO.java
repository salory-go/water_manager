package com.example.netprogarmexample_start.pojo;

import lombok.Data;

/**
 * 项目名: netProgarmExample_start
 * 文件名: VO
 * 创建者: LZS
 * 创建时间:2024/1/11 20:38
 * 描述:
 **/
@Data
public class VO {
    private String name;
    private String code;
    private String E;
    private String W;
    private String address;
    private String base;
    private String vapor;
    private String condition;
    private String quality;
    private String type;

    public VO(String name, String code, String e, String w, String address, String base, String vapor, String condition, String quality, String type) {
        this.name = name;
        this.code = code;
        E = e;
        W = w;
        this.address = address;
        this.base = base;
        this.vapor = vapor;
        this.condition = condition;
        this.quality = quality;
        this.type = type;
    }
}
