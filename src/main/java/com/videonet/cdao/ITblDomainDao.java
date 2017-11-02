package com.videonet.cdao;

import com.videonet.cdomain.TblDomain;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:02:31
 */
@Repository("tblDomainDao")
public interface ITblDomainDao  {

    @Select("Select * from tbl_domain where domainid =#{domainid}")
    TblDomain findById(BigDecimal domainid);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"domainid!=null and domainid!=''\">"+
             "AND domainid=#{domainid}"+
            "</if>"
            +"<if test=\"domainname!=null and domainname!=''\">"+
             "AND domainname=#{domainname}"+
            "</if>"
            +"<if test=\"parentid!=null and parentid!=''\">"+
             "AND parentid=#{parentid}"+
            "</if>"
            +"<if test=\"domainip!=null and domainip!=''\">"+
             "AND domainip=#{domainip}"+
            "</if>"
            +"<if test=\"domainport!=null and domainport!=''\">"+
             "AND domainport=#{domainport}"+
            "</if>"
            +"<if test=\"protocoltype!=null and protocoltype!=''\">"+
             "AND protocoltype=#{protocoltype}"+
            "</if>"
            +"<if test=\"domaintype!=null and domaintype!=''\">"+
             "AND domaintype=#{domaintype}"+
            "</if>"
            +"<if test=\"sipdomainid!=null and sipdomainid!=''\">"+
             "AND sipdomainid=#{sipdomainid}"+
            "</if>"
            +"<if test=\"sipserverid!=null and sipserverid!=''\">"+
             "AND sipserverid=#{sipserverid}"+
            "</if>"
            +"<if test=\"upregisterpassword!=null and upregisterpassword!=''\">"+
             "AND upregisterpassword=#{upregisterpassword}"+
            "</if>"
            +"<if test=\"downregisterpassword!=null and downregisterpassword!=''\">"+
             "AND downregisterpassword=#{downregisterpassword}"+
            "</if>"
            +"<if test=\"connectstate!=null and connectstate!=''\">"+
             "AND connectstate=#{connectstate}"+
            "</if>"
            +"<if test=\"ifonline!=null and ifonline!=''\">"+
             "AND ifonline=#{ifonline}"+
            "</if>"
            +"</script>")
    List<TblDomain> queryList(Map<String, Object> map);

    @Select("select * from tbl_domain")
    List<TblDomain> queryForAllObject(TblDomain baseModel);

    @Insert("<script>INSERT INTO tbl_domain (domainid,domainname,parentid,domainip,domainport,protocoltype,domaintype,sipdomainid,sipserverid,upregisterpassword,downregisterpassword,connectstate,ifonline) values "
            +"(#{domainid},#{domainname},#{parentid},#{domainip},#{domainport},#{protocoltype},#{domaintype},#{sipdomainid},#{sipserverid},#{upregisterpassword},#{downregisterpassword},#{connectstate},#{ifonline})</script>")
    void save(TblDomain tblDomain);

    @Update("<script>UPDATE tbl_domain set domainid=#{domainid},domainname=#{domainname},parentid=#{parentid},domainip=#{domainip},domainport=#{domainport},protocoltype=#{protocoltype},domaintype=#{domaintype},sipdomainid=#{sipdomainid},sipserverid=#{sipserverid},upregisterpassword=#{upregisterpassword},downregisterpassword=#{downregisterpassword},connectstate=#{connectstate},ifonline=#{ifonline} where domainid =#{domainid}</script>")
    void update(TblDomain tblDomain);

    @Delete("<script>DELETE FROM tbl_domain where domainid =#{domainid}</script>")
    void delete(BigDecimal domainid);

    @Delete("DELETE FROM tbl_domain WHERE domainid IN (1,2)")
    void deleteBatch(BigDecimal[] domainids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"domainid!=null and domainid!=''\">"+
             "AND domainid=#{domainid}"+
            "</if>"
            +"<if test=\"domainname!=null and domainname!=''\">"+
             "AND domainname=#{domainname}"+
            "</if>"
            +"<if test=\"parentid!=null and parentid!=''\">"+
             "AND parentid=#{parentid}"+
            "</if>"
            +"<if test=\"domainip!=null and domainip!=''\">"+
             "AND domainip=#{domainip}"+
            "</if>"
            +"<if test=\"domainport!=null and domainport!=''\">"+
             "AND domainport=#{domainport}"+
            "</if>"
            +"<if test=\"protocoltype!=null and protocoltype!=''\">"+
             "AND protocoltype=#{protocoltype}"+
            "</if>"
            +"<if test=\"domaintype!=null and domaintype!=''\">"+
             "AND domaintype=#{domaintype}"+
            "</if>"
            +"<if test=\"sipdomainid!=null and sipdomainid!=''\">"+
             "AND sipdomainid=#{sipdomainid}"+
            "</if>"
            +"<if test=\"sipserverid!=null and sipserverid!=''\">"+
             "AND sipserverid=#{sipserverid}"+
            "</if>"
            +"<if test=\"upregisterpassword!=null and upregisterpassword!=''\">"+
             "AND upregisterpassword=#{upregisterpassword}"+
            "</if>"
            +"<if test=\"downregisterpassword!=null and downregisterpassword!=''\">"+
             "AND downregisterpassword=#{downregisterpassword}"+
            "</if>"
            +"<if test=\"connectstate!=null and connectstate!=''\">"+
             "AND connectstate=#{connectstate}"+
            "</if>"
            +"<if test=\"ifonline!=null and ifonline!=''\">"+
             "AND ifonline=#{ifonline}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);

    @Select(" select * from tbl_domain ")
//    @Results({
//            @Result()
//    })
    List<TblDomain> listTree();
}
