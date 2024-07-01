package com.example.netprogarmexample_start.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

/**
 * 项目名: netProgarmExample_start
 * 文件名: DLXX
 * 创建者: LZS
 * 创建时间:2024/1/11 18:34
 * 描述:
 **/
@Data
public class DLXX {
    private String STCD;
    private String STLC;
    private String NT;
    private BigDecimal LGTD;
    private BigDecimal LTTD;
}
