package com.example.netprogarmexample_start.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * 项目名: netProgarmExample_start
 * 文件名: CZYL
 * 创建者: LZS
 * 创建时间:2024/1/11 18:32
 * 描述:
 **/

//测站预览
@Data
public class CZYL {
    private String STCD;    //测站编码

    private String STNM;    //测站名称

    private String STTP;    //测站类型

    private String NT;  //备注

}
