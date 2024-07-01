package com.example.netprogarmexample_start.mapper;

import com.example.netprogarmexample_start.pojo.CZ;
import com.example.netprogarmexample_start.pojo.CZGL;
import com.example.netprogarmexample_start.pojo.HL;
import com.example.netprogarmexample_start.pojo.ZF;
import org.apache.ibatis.annotations.*;
import org.w3c.dom.ls.LSException;

import java.util.List;

/**
 * 项目名: netProgarmExample_start
 * 文件名: Mapper
 * 创建者: LZS
 * 创建时间:2024/1/11 21:39
 * 描述:
 **/

@Mapper
public interface IMapper {

    @Select("SELECT * from czglxxygb")
    public List<CZGL> getCZGL();

    @Select("SELECT\n" +
            "    a.STNM AS \"name\",\n" +
            "    a.STCD AS \"code\",\n" +
            "    b.LGTD AS \"E\",\n" +
            "    b.LTTD AS \"W\",\n" +
            "    b.STLC AS \"address\",\n" +
            "    a.STTP AS \"type\",\n" +
            "    c.BGTM AS \"StartTime\",\n" +
            "    c.ENDTM AS \"EndTime\",\n" +
            "    c.RVCD AS \"waterName\"\n" +
            "FROM\n" +
            "    czylb a\n" +
            "JOIN\n" +
            "    czdlxxb b ON a.STCD = b.STCD\n" +
            "JOIN\n" +
            "    czglxxygb c ON b.STCD = c.STCD\n")
    public List<CZ> getCZ();

    @Select("SELECT\n" +
            "    a.STNM AS \"CZName\",\n" +
            "    c.RVCD AS \"code\",\n" +
            "    c.RVNM AS \"name\",\n" +
            "    c.HNNM AS \"HName\",\n" +
            "    c.BSHNNM AS \"Lname\"\n" +
            "FROM\n" +
            "    czylb a\n" +
            "JOIN\n" +
            "    czglxxygb b ON a.STCD = b.STCD\n" +
            "JOIN\n" +
            "    hljbxxb c ON  b.RVCD = c.RVCD ")
    public List<HL> getHL();

    @Delete("DELETE FROM czylb WHERE STCD = #{code}")
    public int delete(@Param("code") String code);

    @Update("UPDATE czylb " +
            "SET " +
            "STNM = #{cz.name}, " +
            "STTP = #{cz.type} " +
            "WHERE STCD = #{cz.code}")
    boolean updateCZ1(@Param("cz")CZ cz);

    @Update("UPDATE czdlxxb " +
            "SET " +
            "STLC = #{address}, " +
            "LGTD = #{e}, " +
            "LTTD = #{w} " +
            "WHERE STCD = #{code}")
    boolean updateCZ2(CZ cz);

    @Update("UPDATE czglxxygb " +
            "SET " +
            "BGTM = #{startTime}, " +
            "ENDTM = #{endTime} " +
            "WHERE STCD = #{code}")
    boolean updateCZ3(CZ cz);


        @Insert("INSERT INTO hljbxxb (RVCD, RVNM, HNNM) " +
            "VALUES (#{cz.waterName}, #{cz.riverName}, #{cz.waterField})")
    boolean addCZ1(@Param("cz") CZ cz);

        @Insert("INSERT INTO czdlxxb (STCD, STLC, LGTD, LTTD) " +
            "VALUES (#{cz.code}, #{cz.address}, #{cz.E}, #{cz.W})")
    boolean addCZ2(@Param("cz") CZ cz);


    @Insert("INSERT INTO czglxxygb (STCD, RVCD, BGTM, ENDTM, ADDVCD) " +
            "VALUES (#{cz.code}, #{cz.waterName}, #{cz.startTime}, #{cz.endTime},#{cz.Acd})")
    boolean addCZ3(@Param("cz") CZ cz);

    @Insert("INSERT INTO czylb (STNM,STCD,STTP) " +
            "VALUES (#{cz.name}, #{cz.code}, #{cz.type})")
    boolean addCZ4(@Param("cz") CZ cz);

    @Select("SELECT\n" +
            "    c.STNM AS \"STNM\",\n" +
            "    c.STCD AS \"STCD\",\n" +
            "    a.CHDAY AS \"CHDAY\",\n" +
            "    a.CHGCND AS \"CHGCND\",\n" +
            "    a.ESLCCH AS \"ESLCCH\",\n" +
            "    a.EETP AS \"EETP\",\n" +
            "    a.NBTPG AS \"NBTPG\",\n" +
            "    a.ARSTOB AS \"ARSTOB\",\n" +
            "    a.ADMNST AS \"ADMNST\"\n" +
            "FROM\n" +
            "    smzflgccxxb a\n" +
            "JOIN\n" +
            "    smzflgccygb b ON a.HYEVEA = b.HYEVEA\n" +
            "JOIN\n" +
            "    czylb c ON b.STCD = c.STCD\n")
    List<ZF> getZF();
//


}
