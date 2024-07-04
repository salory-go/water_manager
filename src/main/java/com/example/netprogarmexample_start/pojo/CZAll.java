package com.example.netprogarmexample_start.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class CZAll {
    private String STNM;    //测站名称
    private String STCD;    //测站编码
    private Date BGTM;  //开始时间
    private Date ENDTM; //结束时间
    private String RVCD;    //河流编码
    private String RVNM;   //流域名称
    private String ADDVCD;  //行政编码
    private String STLC;  //站址
    private String STTP;    //测站类型
    private String WRRGCD;  //水资源编码
    private String HNNM;  //水系名称
    private String WFRCD;   //水功能区编码
    private String ADMNSTCD;    //行政区编码
    private String MNAG;    //管理机构编码
    private String LGTD;   //东经
    private String LTTD;   //纬度
}
