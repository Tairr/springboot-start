package com.videonet.dao;

import com.videonet.domain.SysAccount;
import com.videonet.comm.base.BaseModel;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SelectBuilder.*;

/**
 * 账户信息
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-30 15:41:53
 */
@Repository("sysAccountDao")
public interface ISysAccountDao  {

    @Select("Select * from sys_account where id =#{id}")
    SysAccount findById(String id);

    @Select("Select * from sys_account where username =#{username}")
    SysAccount findByUsername(String username);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"username!=null and username!=''\">"+
             "AND username=#{username}"+
            "</if>"
            +"<if test=\"password!=null and password!=''\">"+
             "AND password=#{password}"+
            "</if>"
            +"<if test=\"salt!=null and salt!=''\">"+
             "AND salt=#{salt}"+
            "</if>"
            +"<if test=\"create_time!=null and create_time!=''\">"+
             "AND create_time=#{create_time}"+
            "</if>"
            +"<if test=\"update_time!=null and update_time!=''\">"+
             "AND update_time=#{update_time}"+
            "</if>"
            +"<if test=\"if_use!=null and if_use!=''\">"+
             "AND if_use=#{if_use}"+
            "</if>"
            +"<if test=\"order_num!=null and order_num!=''\">"+
             "AND order_num=#{order_num}"+
            "</if>"
            +"<if test=\"token!=null and token!=''\">"+
             "AND token=#{token}"+
            "</if>"
            +"<if test=\"app_id!=null and app_id!=''\">"+
             "AND app_id=#{app_id}"+
            "</if>"
            +"<if test=\"communicationid!=null and communicationid!=''\">"+
             "AND communicationid=#{communicationid}"+
            "</if>"
            +"</script>")
    List<SysAccount> queryList(Map<String, Object> map);

    @Select("select * from sys_account")
    List<SysAccount> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_account (id,username,password,salt,create_time,update_time,if_use,order_num,token,app_id,communicationid) values "
            +"(#{id},#{username},#{password},#{salt},#{createTime},#{updateTime},#{ifUse},#{orderNum},#{token},#{appId},#{communicationid})</script>")
    void save(SysAccount sysAccount);

    @Update("<script>UPDATE sys_account set id=#{id},username=#{username},password=#{password},salt=#{salt},create_time=#{create_time},update_time=#{update_time},if_use=#{if_use},order_num=#{order_num},token=#{token},app_id=#{app_id},communicationid=#{communicationid} where id =#{id}</script>")
    void update(SysAccount sysAccount);

    @Delete("<script>DELETE FROM sys_account where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_account WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"username!=null and username!=''\">"+
             "AND username=#{username}"+
            "</if>"
            +"<if test=\"password!=null and password!=''\">"+
             "AND password=#{password}"+
            "</if>"
            +"<if test=\"salt!=null and salt!=''\">"+
             "AND salt=#{salt}"+
            "</if>"
            +"<if test=\"create_time!=null and create_time!=''\">"+
             "AND create_time=#{create_time}"+
            "</if>"
            +"<if test=\"update_time!=null and update_time!=''\">"+
             "AND update_time=#{update_time}"+
            "</if>"
            +"<if test=\"if_use!=null and if_use!=''\">"+
             "AND if_use=#{if_use}"+
            "</if>"
            +"<if test=\"order_num!=null and order_num!=''\">"+
             "AND order_num=#{order_num}"+
            "</if>"
            +"<if test=\"token!=null and token!=''\">"+
             "AND token=#{token}"+
            "</if>"
            +"<if test=\"app_id!=null and app_id!=''\">"+
             "AND app_id=#{app_id}"+
            "</if>"
            +"<if test=\"communicationid!=null and communicationid!=''\">"+
             "AND communicationid=#{communicationid}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);


    public static String testProvider(Map params){

        BEGIN();
        SELECT("s.username,s.password");
        FROM("SysAccount s");

        WHERE("s.username = #{username}");

        return SQL();
    }

    @SelectProvider(type=ISysAccountDao.class,method = "testProvider")
    List testQuery(@Param("username")String username);
	
}
