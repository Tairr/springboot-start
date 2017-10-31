package com.videonet.dao;

import com.videonet.domain.SysAccountUser;
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
@Repository("sysAccountUserDao")
public interface ISysAccountUserDao  {

    @Select("Select * from sys_account_user where id =#{id}")
    SysAccountUser findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"account_id!=null and account_id!=''\">"+
             "AND account_id=#{account_id}"+
            "</if>"
            +"<if test=\"user_id!=null and user_id!=''\">"+
             "AND user_id=#{user_id}"+
            "</if>"
            +"</script>")
    List<SysAccountUser> queryList(Map<String, Object> map);

    @Select("select * from sys_account_user")
    List<SysAccountUser> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_account_user (id,account_id,user_id) values "
            +"(#{id},#{account_id},#{user_id})</script>")
    void save(SysAccountUser sysAccountUser);

    @Update("<script>UPDATE sys_account_user set id=#{id},account_id=#{account_id},user_id=#{user_id} where id =#{id}</script>")
    void update(SysAccountUser sysAccountUser);

    @Delete("<script>DELETE FROM sys_account_user where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_account_user WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"account_id!=null and account_id!=''\">"+
             "AND account_id=#{account_id}"+
            "</if>"
            +"<if test=\"user_id!=null and user_id!=''\">"+
             "AND user_id=#{user_id}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
