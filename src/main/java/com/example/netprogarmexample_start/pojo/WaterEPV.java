package com.example.netprogarmexample_start.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 项目名: netProgarmExample_start
 * 文件名: WaterEPV
 * 创建者: LZS
 * 创建时间:2024/1/11 18:43
 * 描述:
 **/

//水面蒸发过程参数信息
@Data
public class WaterEPV {
    private String HYEVEA;  //水文事件区
    private String CHGCND;  //变化条件
    private String ESLCCH;  //蒸发地点变化
    private String EETP;    //蒸发设备类型
    private String NBTPG;   //显著页面
    private String ARSTOB;  //区域状态观察
    private String ADMNST;  //行政状态
    private String NT;  //备注
    private Date CHDAY; //变化日期

}
