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
    private String STNM;
    private String STCD;
    private Date BGTM;
    private Date ENDTM;
    private String RVCD;
    private String ADDVCD;
    private String WRRGCD;
    private String WFRCD;
    private String ADMNSTCD;
    private String MNAG;
    private String NT;
}
