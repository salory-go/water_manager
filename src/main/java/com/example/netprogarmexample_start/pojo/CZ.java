package com.example.netprogarmexample_start.pojo;

import lombok.Data;

/**
 * 项目名: netProgarmExample_start
 * 文件名: CZ
 * 创建者: LZS
 * 创建时间:2024/1/11 21:40
 * 描述:
 **/

// 测站

@Data
public class CZ {
    private String name;    //czylb.STNM
    private String code;    //czylb.STCD
    private String E;   //czdlxxb.LGTD
    private String W;   //czdlxxb.LTTD
    private String address; //czdlxxb.STLC
    private String startTime;   //czglxxygb.BGTM
    private String endTime; //czglxxygb.ENDTM
    private String waterName;   //czglxxygb.RVCD
    private String riverName;   //hljbxxb.RVNM
    private String waterField;  //hljbxxb.HNNM
    private String type;    //czylb.STTP
    private String Acd; //czglxxygb.ADDVCD
}
