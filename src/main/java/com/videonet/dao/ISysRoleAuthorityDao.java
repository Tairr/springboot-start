package com.videonet.dao;

import com.videonet.domain.SysRoleAuthority;
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
@Repository("sysRoleAuthorityDao")
public interface ISysRoleAuthorityDao  {

    @Select("Select * from sys_role_authority where id =#{id}")
    SysRoleAuthority findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"authority_id!=null and authority_id!=''\">"+
             "AND authority_id=#{authority_id}"+
            "</if>"
            +"<if test=\"role_id!=null and role_id!=''\">"+
             "AND role_id=#{role_id}"+
            "</if>"
            +"</script>")
    List<SysRoleAuthority> queryList(Map<String, Object> map);

    @Select("select * from sys_role_authority")
    List<SysRoleAuthority> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_role_authority (id,authority_id,role_id) values "
            +"(#{id},#{authority_id},#{role_id})</script>")
    void save(SysRoleAuthority sysRoleAuthority);

    @Update("<script>UPDATE sys_role_authority set id=#{id},authority_id=#{authority_id},role_id=#{role_id} where id =#{id}</script>")
    void update(SysRoleAuthority sysRoleAuthority);

    @Delete("<script>DELETE FROM sys_role_authority where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_role_authority WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"authority_id!=null and authority_id!=''\">"+
             "AND authority_id=#{authority_id}"+
            "</if>"
            +"<if test=\"role_id!=null and role_id!=''\">"+
             "AND role_id=#{role_id}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
