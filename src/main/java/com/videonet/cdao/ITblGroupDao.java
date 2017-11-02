package com.videonet.cdao;

import com.videonet.cdomain.TblGroup;

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
 * @date 2017-11-02 19:02:40
 */
@Repository("tblGroupDao")
public interface ITblGroupDao  {

    @Select("Select * from tbl_group where autoid =#{autoid}")
    TblGroup findById(Integer autoid);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"autoid!=null and autoid!=''\">"+
             "AND autoid=#{autoid}"+
            "</if>"
            +"<if test=\"groupid!=null and groupid!=''\">"+
             "AND groupid=#{groupid}"+
            "</if>"
            +"<if test=\"groupname!=null and groupname!=''\">"+
             "AND groupname=#{groupname}"+
            "</if>"
            +"<if test=\"domainid!=null and domainid!=''\">"+
             "AND domainid=#{domainid}"+
            "</if>"
            +"<if test=\"parentid!=null and parentid!=''\">"+
             "AND parentid=#{parentid}"+
            "</if>"
            +"<if test=\"ishasgis!=null and ishasgis!=''\">"+
             "AND ishasgis=#{ishasgis}"+
            "</if>"
            +"</script>")
    List<TblGroup> queryList(Map<String, Object> map);

    @Select("select * from tbl_group")
    List<TblGroup> queryForAllObject(TblGroup baseModel);

    @Insert("<script>INSERT INTO tbl_group (autoid,groupid,groupname,domainid,parentid,ishasgis) values "
            +"(#{autoid},#{groupid},#{groupname},#{domainid},#{parentid},#{ishasgis})</script>")
    void save(TblGroup tblGroup);

    @Update("<script>UPDATE tbl_group set autoid=#{autoid},groupid=#{groupid},groupname=#{groupname},domainid=#{domainid},parentid=#{parentid},ishasgis=#{ishasgis} where autoid =#{autoid}</script>")
    void update(TblGroup tblGroup);

    @Delete("<script>DELETE FROM tbl_group where autoid =#{autoid}</script>")
    void delete(Integer autoid);

    @Delete("DELETE FROM tbl_group WHERE autoid IN (1,2)")
    void deleteBatch(Integer[] autoids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"autoid!=null and autoid!=''\">"+
             "AND autoid=#{autoid}"+
            "</if>"
            +"<if test=\"groupid!=null and groupid!=''\">"+
             "AND groupid=#{groupid}"+
            "</if>"
            +"<if test=\"groupname!=null and groupname!=''\">"+
             "AND groupname=#{groupname}"+
            "</if>"
            +"<if test=\"domainid!=null and domainid!=''\">"+
             "AND domainid=#{domainid}"+
            "</if>"
            +"<if test=\"parentid!=null and parentid!=''\">"+
             "AND parentid=#{parentid}"+
            "</if>"
            +"<if test=\"ishasgis!=null and ishasgis!=''\">"+
             "AND ishasgis=#{ishasgis}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
