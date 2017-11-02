package com.videonet.dao;

import com.videonet.domain.SysAuthority;
import com.videonet.domain.SysResource;
import com.videonet.comm.base.BaseModel;

import org.apache.ibatis.annotations.*;
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
@Repository("sysResourceDao")
public interface ISysResourceDao  {

    @Select("Select * from sys_resource where id =#{id}")
    SysResource findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"resource_name!=null and resource_name!=''\">"+
             "AND resource_name=#{resource_name}"+
            "</if>"
            +"<if test=\"description!=null and description!=''\">"+
             "AND description=#{description}"+
            "</if>"
            +"<if test=\"type!=null and type!=''\">"+
             "AND type=#{type}"+
            "</if>"
            +"<if test=\"parent_id!=null and parent_id!=''\">"+
             "AND parent_id=#{parent_id}"+
            "</if>"
            +"<if test=\"parent_name!=null and parent_name!=''\">"+
             "AND parent_name=#{parent_name}"+
            "</if>"
            +"<if test=\"app_name!=null and app_name!=''\">"+
             "AND app_name=#{app_name}"+
            "</if>"
            +"<if test=\"url!=null and url!=''\">"+
             "AND url=#{url}"+
            "</if>"
            +"<if test=\"level!=null and level!=''\">"+
             "AND level=#{level}"+
            "</if>"
            +"<if test=\"is_menuleaf!=null and is_menuleaf!=''\">"+
             "AND is_menuleaf=#{is_menuleaf}"+
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
            +"</script>")
    List<SysResource> queryList(Map<String, Object> map);

    @Select("select * from sys_resource")
    List<SysResource> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_resource (id,resource_name,description,type,parent_id,parent_name,app_name,url,level,is_menuleaf,create_time,update_time,ifuse,order_num) values "
            +"(#{id},#{resource_name},#{description},#{type},#{parent_id},#{parent_name},#{app_name},#{url},#{level},#{is_menuleaf},#{create_time},#{update_time},#{ifuse},#{order_num})</script>")
    void save(SysResource sysResource);

    @Update("<script>UPDATE sys_resource set id=#{id},resource_name=#{resource_name},description=#{description},type=#{type},parent_id=#{parent_id},parent_name=#{parent_name},app_name=#{app_name},url=#{url},level=#{level},is_menuleaf=#{is_menuleaf},create_time=#{create_time},update_time=#{update_time},ifuse=#{ifuse},order_num=#{order_num} where id =#{id}</script>")
    void update(SysResource sysResource);

    @Delete("<script>DELETE FROM sys_resource where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_resource WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"resource_name!=null and resource_name!=''\">"+
             "AND resource_name=#{resource_name}"+
            "</if>"
            +"<if test=\"description!=null and description!=''\">"+
             "AND description=#{description}"+
            "</if>"
            +"<if test=\"type!=null and type!=''\">"+
             "AND type=#{type}"+
            "</if>"
            +"<if test=\"parent_id!=null and parent_id!=''\">"+
             "AND parent_id=#{parent_id}"+
            "</if>"
            +"<if test=\"parent_name!=null and parent_name!=''\">"+
             "AND parent_name=#{parent_name}"+
            "</if>"
            +"<if test=\"app_name!=null and app_name!=''\">"+
             "AND app_name=#{app_name}"+
            "</if>"
            +"<if test=\"url!=null and url!=''\">"+
             "AND url=#{url}"+
            "</if>"
            +"<if test=\"level!=null and level!=''\">"+
             "AND level=#{level}"+
            "</if>"
            +"<if test=\"is_menuleaf!=null and is_menuleaf!=''\">"+
             "AND is_menuleaf=#{is_menuleaf}"+
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
            +"</script>")
    int queryTotal(Map<String, Object> map);

    @Select("SELECT res.*,ac.username from sys_account ac   "
            +" LEFT JOIN sys_account_role acr  ON ac.id=acr.ACCOUNT_ID "
            +" LEFT JOIN sys_role_authority roa ON acr.ROLE_ID=roa.ROLE_ID "
            +" LEFT JOIN sys_resource_authority  rea on roa.AUTHORITY_ID=rea.AUTHORITY_ID "
            +" LEFT JOIN sys_resource res ON rea.RESOURCE_ID = res.ID "
            +" WHERE ac.USERNAME= #{username} and res.ID is not null ")
    @Results({
            @Result(column = "username",property = "account.username")
    })
    List<SysResource> getAccountAuthorities(String username);
	
}
