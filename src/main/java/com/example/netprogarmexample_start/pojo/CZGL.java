package com.example.netprogarmexample_start.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 项目名: netProgarmExample_start
 * 文件名: CZGL
 * 创建者: LZS
 * 创建时间:2024/1/11 18:37
 * 描述:
 **/

// 测站管理
@Data
public class CZGL {
    private String STNM;    //测站名称
    private String STCD;    //测站编码
    private Date BGTM;  //开始时间
    private Date ENDTM; //结束时间
    private String RVCD;    //河流编码
    private String ADDVCD;  //行政编码
    private String WRRGCD;  //水资源编码
    private String WFRCD;   //水功能区编码
    private String ADMNSTCD;    //行政区编码
    private String MNAG;    //管理机构编码
    private String NT;  //备注
}
