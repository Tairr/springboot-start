package com.videonet.dao;

import com.videonet.domain.SysResourceAuthority;
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
@Repository("sysResourceAuthorityDao")
public interface ISysResourceAuthorityDao  {

    @Select("Select * from sys_resource_authority where id =#{id}")
    SysResourceAuthority findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"authority_id!=null and authority_id!=''\">"+
             "AND authority_id=#{authority_id}"+
            "</if>"
            +"<if test=\"resource_id!=null and resource_id!=''\">"+
             "AND resource_id=#{resource_id}"+
            "</if>"
            +"</script>")
    List<SysResourceAuthority> queryList(Map<String, Object> map);

    @Select("select * from sys_resource_authority")
    List<SysResourceAuthority> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_resource_authority (id,authority_id,resource_id) values "
            +"(#{id},#{authority_id},#{resource_id})</script>")
    void save(SysResourceAuthority sysResourceAuthority);

    @Update("<script>UPDATE sys_resource_authority set id=#{id},authority_id=#{authority_id},resource_id=#{resource_id} where id =#{id}</script>")
    void update(SysResourceAuthority sysResourceAuthority);

    @Delete("<script>DELETE FROM sys_resource_authority where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_resource_authority WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"authority_id!=null and authority_id!=''\">"+
             "AND authority_id=#{authority_id}"+
            "</if>"
            +"<if test=\"resource_id!=null and resource_id!=''\">"+
             "AND resource_id=#{resource_id}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
