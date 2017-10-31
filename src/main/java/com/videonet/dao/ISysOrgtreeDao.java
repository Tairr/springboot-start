package com.videonet.dao;

import com.videonet.domain.SysOrgtree;
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
@Repository("sysOrgtreeDao")
public interface ISysOrgtreeDao  {

    @Select("Select * from sys_orgtree where id =#{id}")
    SysOrgtree findById(String id);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"org_id!=null and org_id!=''\">"+
             "AND org_id=#{org_id}"+
            "</if>"
            +"<if test=\"children_id!=null and children_id!=''\">"+
             "AND children_id=#{children_id}"+
            "</if>"
            +"</script>")
    List<SysOrgtree> queryList(Map<String, Object> map);

    @Select("select * from sys_orgtree")
    List<SysOrgtree> queryForAllObject(BaseModel baseModel);

    @Insert("<script>INSERT INTO sys_orgtree (id,org_id,children_id) values "
            +"(#{id},#{org_id},#{children_id})</script>")
    void save(SysOrgtree sysOrgtree);

    @Update("<script>UPDATE sys_orgtree set id=#{id},org_id=#{org_id},children_id=#{children_id} where id =#{id}</script>")
    void update(SysOrgtree sysOrgtree);

    @Delete("<script>DELETE FROM sys_orgtree where id =#{id}</script>")
    void delete(String id);

    @Delete("DELETE FROM sys_orgtree WHERE id IN (1,2)")
    void deleteBatch(String[] ids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"id!=null and id!=''\">"+
             "AND id=#{id}"+
            "</if>"
            +"<if test=\"org_id!=null and org_id!=''\">"+
             "AND org_id=#{org_id}"+
            "</if>"
            +"<if test=\"children_id!=null and children_id!=''\">"+
             "AND children_id=#{children_id}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
