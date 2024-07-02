package com.example.netprogarmexample_start.pojo;

import lombok.Data;

/**
 * 项目名: netProgarmExample_start
 * 文件名: WaterInfo
 * 创建者: LZS
 * 创建时间:2024/1/11 18:40
 * 描述:
 **/

//河流基本信息
@Data
public class WaterInfo {
    private String RVCD;    //河流编码
    private String RVNM;    //河流名称
    private String HNNM;    //水系名称
    private String BSHNNM;  //流域水系名称
    private String NT;  //备注
}
