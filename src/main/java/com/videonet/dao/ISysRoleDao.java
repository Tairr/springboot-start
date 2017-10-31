package com.videonet.dao;

import com.videonet.domain.SysRole;
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
@Repository("sysRoleDao")
public interface ISysRoleDao  {

    @Select("Select * from sys_role where id =#{id}")
    SysRole findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"rolename!=null and rolename!=''\">"+
             "AND rolename=#{rolename}"+
            "</if>"
            +"<if test=\"description!=null and description!=''\">"+
             "AND description=#{description}"+
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
            +"</script>")
    List<SysRole> queryList(Map<String, Object> map);

    @Select("select * from sys_role")
    List<SysRole> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_role (id,rolename,description,create_time,update_time,if_use,order_num) values "
            +"(#{id},#{rolename},#{description},#{create_time},#{update_time},#{if_use},#{order_num})</script>")
    void save(SysRole sysRole);

    @Update("<script>UPDATE sys_role set id=#{id},rolename=#{rolename},description=#{description},create_time=#{create_time},update_time=#{update_time},if_use=#{if_use},order_num=#{order_num} where id =#{id}</script>")
    void update(SysRole sysRole);

    @Delete("<script>DELETE FROM sys_role where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_role WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"rolename!=null and rolename!=''\">"+
             "AND rolename=#{rolename}"+
            "</if>"
            +"<if test=\"description!=null and description!=''\">"+
             "AND description=#{description}"+
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
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
