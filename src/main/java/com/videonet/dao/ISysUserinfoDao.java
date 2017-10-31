package com.videonet.dao;

import com.videonet.domain.SysUserinfo;
import com.videonet.comm.base.BaseModel;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-30 15:41:53
 */
@Repository("sysUserinfoDao")
public interface ISysUserinfoDao  {

    @Select("Select * from sys_userinfo where id =#{id}")
    SysUserinfo findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"realname!=null and realname!=''\">"+
             "AND realname=#{realname}"+
            "</if>"
            +"<if test=\"gender!=null and gender!=''\">"+
             "AND gender=#{gender}"+
            "</if>"
            +"<if test=\"nation!=null and nation!=''\">"+
             "AND nation=#{nation}"+
            "</if>"
            +"<if test=\"nativeplace!=null and nativeplace!=''\">"+
             "AND nativeplace=#{nativeplace}"+
            "</if>"
            +"<if test=\"birthdate!=null and birthdate!=''\">"+
             "AND birthdate=#{birthdate}"+
            "</if>"
            +"<if test=\"politicalstatus!=null and politicalstatus!=''\">"+
             "AND politicalstatus=#{politicalstatus}"+
            "</if>"
            +"<if test=\"maritalstatus!=null and maritalstatus!=''\">"+
             "AND maritalstatus=#{maritalstatus}"+
            "</if>"
            +"<if test=\"nickname!=null and nickname!=''\">"+
             "AND nickname=#{nickname}"+
            "</if>"
            +"<if test=\"picture!=null and picture!=''\">"+
             "AND picture=#{picture}"+
            "</if>"
            +"<if test=\"phone!=null and phone!=''\">"+
             "AND phone=#{phone}"+
            "</if>"
            +"<if test=\"mail!=null and mail!=''\">"+
             "AND mail=#{mail}"+
            "</if>"
            +"<if test=\"org!=null and org!=''\">"+
             "AND org=#{org}"+
            "</if>"
            +"<if test=\"policenum!=null and policenum!=''\">"+
             "AND policenum=#{policenum}"+
            "</if>"
            +"<if test=\"identitycode!=null and identitycode!=''\">"+
             "AND identitycode=#{identitycode}"+
            "</if>"
            +"<if test=\"qr!=null and qr!=''\">"+
             "AND qr=#{qr}"+
            "</if>"
            +"<if test=\"qq!=null and qq!=''\">"+
             "AND qq=#{qq}"+
            "</if>"
            +"<if test=\"wechat!=null and wechat!=''\">"+
             "AND wechat=#{wechat}"+
            "</if>"
            +"<if test=\"jobcode!=null and jobcode!=''\">"+
             "AND jobcode=#{jobcode}"+
            "</if>"
            +"<if test=\"station!=null and station!=''\">"+
             "AND station=#{station}"+
            "</if>"
            +"<if test=\"autograph!=null and autograph!=''\">"+
             "AND autograph=#{autograph}"+
            "</if>"
            +"<if test=\"home_address!=null and home_address!=''\">"+
             "AND home_address=#{home_address}"+
            "</if>"
            +"<if test=\"office_address!=null and office_address!=''\">"+
             "AND office_address=#{office_address}"+
            "</if>"
            +"<if test=\"other_address!=null and other_address!=''\">"+
             "AND other_address=#{other_address}"+
            "</if>"
            +"<if test=\"officetelephone!=null and officetelephone!=''\">"+
             "AND officetelephone=#{officetelephone}"+
            "</if>"
            +"<if test=\"othertelephone!=null and othertelephone!=''\">"+
             "AND othertelephone=#{othertelephone}"+
            "</if>"
            +"<if test=\"ifhide_num!=null and ifhide_num!=''\">"+
             "AND ifhide_num=#{ifhide_num}"+
            "</if>"
            +"<if test=\"create_time!=null and create_time!=''\">"+
             "AND create_time=#{create_time}"+
            "</if>"
            +"<if test=\"update_time!=null and update_time!=''\">"+
             "AND update_time=#{update_time}"+
            "</if>"
            +"<if test=\"ifuse!=null and ifuse!=''\">"+
             "AND ifuse=#{ifuse}"+
            "</if>"
            +"<if test=\"order_num!=null and order_num!=''\">"+
             "AND order_num=#{order_num}"+
            "</if>"
            +"<if test=\"orgid!=null and orgid!=''\">"+
             "AND orgid=#{orgid}"+
            "</if>"
            +"</script>")
    List<SysUserinfo> queryList(Map<String, Object> map);

    @Select("select * from sys_userinfo")
    List<SysUserinfo> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_userinfo (id,realname,gender,nation,nativeplace,birthdate,politicalstatus,maritalstatus,nickname,picture,phone,mail,org,policenum,identitycode,qr,qq,wechat,jobcode,station,autograph,home_address,office_address,other_address,officetelephone,othertelephone,ifhide_num,create_time,update_time,ifuse,order_num,orgid) values "
            +"(#{id},#{realname},#{gender},#{nation},#{nativeplace},#{birthdate},#{politicalstatus},#{maritalstatus},#{nickname},#{picture},#{phone},#{mail},#{org},#{policenum},#{identitycode},#{qr},#{qq},#{wechat},#{jobcode},#{station},#{autograph},#{home_address},#{office_address},#{other_address},#{officetelephone},#{othertelephone},#{ifhide_num},#{create_time},#{update_time},#{ifuse},#{order_num},#{orgid})</script>")
    void save(SysUserinfo sysUserinfo);

    @Update("<script>UPDATE sys_userinfo set id=#{id},realname=#{realname},gender=#{gender},nation=#{nation},nativeplace=#{nativeplace},birthdate=#{birthdate},politicalstatus=#{politicalstatus},maritalstatus=#{maritalstatus},nickname=#{nickname},picture=#{picture},phone=#{phone},mail=#{mail},org=#{org},policenum=#{policenum},identitycode=#{identitycode},qr=#{qr},qq=#{qq},wechat=#{wechat},jobcode=#{jobcode},station=#{station},autograph=#{autograph},home_address=#{home_address},office_address=#{office_address},other_address=#{other_address},officetelephone=#{officetelephone},othertelephone=#{othertelephone},ifhide_num=#{ifhide_num},create_time=#{create_time},update_time=#{update_time},ifuse=#{ifuse},order_num=#{order_num},orgid=#{orgid} where id =#{id}</script>")
    void update(SysUserinfo sysUserinfo);

    @Delete("<script>DELETE FROM sys_userinfo where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_userinfo WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"realname!=null and realname!=''\">"+
             "AND realname=#{realname}"+
            "</if>"
            +"<if test=\"gender!=null and gender!=''\">"+
             "AND gender=#{gender}"+
            "</if>"
            +"<if test=\"nation!=null and nation!=''\">"+
             "AND nation=#{nation}"+
            "</if>"
            +"<if test=\"nativeplace!=null and nativeplace!=''\">"+
             "AND nativeplace=#{nativeplace}"+
            "</if>"
            +"<if test=\"birthdate!=null and birthdate!=''\">"+
             "AND birthdate=#{birthdate}"+
            "</if>"
            +"<if test=\"politicalstatus!=null and politicalstatus!=''\">"+
             "AND politicalstatus=#{politicalstatus}"+
            "</if>"
            +"<if test=\"maritalstatus!=null and maritalstatus!=''\">"+
             "AND maritalstatus=#{maritalstatus}"+
            "</if>"
            +"<if test=\"nickname!=null and nickname!=''\">"+
             "AND nickname=#{nickname}"+
            "</if>"
            +"<if test=\"picture!=null and picture!=''\">"+
             "AND picture=#{picture}"+
            "</if>"
            +"<if test=\"phone!=null and phone!=''\">"+
             "AND phone=#{phone}"+
            "</if>"
            +"<if test=\"mail!=null and mail!=''\">"+
             "AND mail=#{mail}"+
            "</if>"
            +"<if test=\"org!=null and org!=''\">"+
             "AND org=#{org}"+
            "</if>"
            +"<if test=\"policenum!=null and policenum!=''\">"+
             "AND policenum=#{policenum}"+
            "</if>"
            +"<if test=\"identitycode!=null and identitycode!=''\">"+
             "AND identitycode=#{identitycode}"+
            "</if>"
            +"<if test=\"qr!=null and qr!=''\">"+
             "AND qr=#{qr}"+
            "</if>"
            +"<if test=\"qq!=null and qq!=''\">"+
             "AND qq=#{qq}"+
            "</if>"
            +"<if test=\"wechat!=null and wechat!=''\">"+
             "AND wechat=#{wechat}"+
            "</if>"
            +"<if test=\"jobcode!=null and jobcode!=''\">"+
             "AND jobcode=#{jobcode}"+
            "</if>"
            +"<if test=\"station!=null and station!=''\">"+
             "AND station=#{station}"+
            "</if>"
            +"<if test=\"autograph!=null and autograph!=''\">"+
             "AND autograph=#{autograph}"+
            "</if>"
            +"<if test=\"home_address!=null and home_address!=''\">"+
             "AND home_address=#{home_address}"+
            "</if>"
            +"<if test=\"office_address!=null and office_address!=''\">"+
             "AND office_address=#{office_address}"+
            "</if>"
            +"<if test=\"other_address!=null and other_address!=''\">"+
             "AND other_address=#{other_address}"+
            "</if>"
            +"<if test=\"officetelephone!=null and officetelephone!=''\">"+
             "AND officetelephone=#{officetelephone}"+
            "</if>"
            +"<if test=\"othertelephone!=null and othertelephone!=''\">"+
             "AND othertelephone=#{othertelephone}"+
            "</if>"
            +"<if test=\"ifhide_num!=null and ifhide_num!=''\">"+
             "AND ifhide_num=#{ifhide_num}"+
            "</if>"
            +"<if test=\"create_time!=null and create_time!=''\">"+
             "AND create_time=#{create_time}"+
            "</if>"
            +"<if test=\"update_time!=null and update_time!=''\">"+
             "AND update_time=#{update_time}"+
            "</if>"
            +"<if test=\"ifuse!=null and ifuse!=''\">"+
             "AND ifuse=#{ifuse}"+
            "</if>"
            +"<if test=\"order_num!=null and order_num!=''\">"+
             "AND order_num=#{order_num}"+
            "</if>"
            +"<if test=\"orgid!=null and orgid!=''\">"+
             "AND orgid=#{orgid}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
