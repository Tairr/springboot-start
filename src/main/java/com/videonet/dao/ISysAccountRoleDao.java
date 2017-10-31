package com.videonet.dao;

import com.videonet.domain.SysAccountRole;
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
@Repository("sysAccountRoleDao")
public interface ISysAccountRoleDao  {

    @Select("Select * from sys_account_role where id =#{id}")
    SysAccountRole findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"account_id!=null and account_id!=''\">"+
             "AND account_id=#{account_id}"+
            "</if>"
            +"<if test=\"role_id!=null and role_id!=''\">"+
             "AND role_id=#{role_id}"+
            "</if>"
            +"</script>")
    List<SysAccountRole> queryList(Map<String, Object> map);

    @Select("select * from sys_account_role")
    List<SysAccountRole> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_account_role (id,account_id,role_id) values "
            +"(#{id},#{account_id},#{role_id})</script>")
    void save(SysAccountRole sysAccountRole);

    @Update("<script>UPDATE sys_account_role set id=#{id},account_id=#{account_id},role_id=#{role_id} where id =#{id}</script>")
    void update(SysAccountRole sysAccountRole);

    @Delete("<script>DELETE FROM sys_account_role where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_account_role WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"account_id!=null and account_id!=''\">"+
             "AND account_id=#{account_id}"+
            "</if>"
            +"<if test=\"role_id!=null and role_id!=''\">"+
             "AND role_id=#{role_id}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
