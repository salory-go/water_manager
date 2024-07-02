package com.example.netprogarmexample_start.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 项目名: netProgarmExample_start
 * 文件名: WaterEP
 * 创建者: LZS
 * 创建时间:2024/1/11 18:42
 * 描述:
 **/

//水面蒸发过程采样规表
@Data
public class WaterEP {
    private String STCD;    //测站编码
    private String HYEVEA;  //水文事件区
    private Date CHDAY; //变化日期
    private String NT;  //备注
}
