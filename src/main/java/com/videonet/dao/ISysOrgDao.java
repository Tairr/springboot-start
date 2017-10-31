package com.videonet.dao;

import com.videonet.domain.SysOrg;
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
@Repository("sysOrgDao")
public interface ISysOrgDao  {

    @Select("Select * from sys_org where id =#{id}")
    SysOrg findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"org_name!=null and org_name!=''\">"+
             "AND org_name=#{org_name}"+
            "</if>"
            +"<if test=\"leader!=null and leader!=''\">"+
             "AND leader=#{leader}"+
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
            +"<if test=\"parent_id!=null and parent_id!=''\">"+
             "AND parent_id=#{parent_id}"+
            "</if>"
            +"<if test=\"parent_name!=null and parent_name!=''\">"+
             "AND parent_name=#{parent_name}"+
            "</if>"
            +"<if test=\"path!=null and path!=''\">"+
             "AND path=#{path}"+
            "</if>"
            +"</script>")
    List<SysOrg> queryList(Map<String, Object> map);

    @Select("select * from sys_org")
    List<SysOrg> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_org (id,org_name,leader,create_time,update_time,if_use,order_num,parent_id,parent_name,path) values "
            +"(#{id},#{org_name},#{leader},#{create_time},#{update_time},#{if_use},#{order_num},#{parent_id},#{parent_name},#{path})</script>")
    void save(SysOrg sysOrg);

    @Update("<script>UPDATE sys_org set id=#{id},org_name=#{org_name},leader=#{leader},create_time=#{create_time},update_time=#{update_time},if_use=#{if_use},order_num=#{order_num},parent_id=#{parent_id},parent_name=#{parent_name},path=#{path} where id =#{id}</script>")
    void update(SysOrg sysOrg);

    @Delete("<script>DELETE FROM sys_org where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_org WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"org_name!=null and org_name!=''\">"+
             "AND org_name=#{org_name}"+
            "</if>"
            +"<if test=\"leader!=null and leader!=''\">"+
             "AND leader=#{leader}"+
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
            +"<if test=\"parent_id!=null and parent_id!=''\">"+
             "AND parent_id=#{parent_id}"+
            "</if>"
            +"<if test=\"parent_name!=null and parent_name!=''\">"+
             "AND parent_name=#{parent_name}"+
            "</if>"
            +"<if test=\"path!=null and path!=''\">"+
             "AND path=#{path}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
