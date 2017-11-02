package com.videonet.cdao;

import com.videonet.cdomain.TblResAttr;

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
 * @date 2017-11-02 19:03:02
 */
@Repository("tblResAttrDao")
public interface ITblResAttrDao  {

    @Select("Select * from tbl_res_attr where autoid =#{autoid}")
    TblResAttr findById(Integer autoid);

    @Select("<script>SELECT  * FROM sys_account WHERE 1=1"
            +"<if test=\"autoid!=null and autoid!=''\">"+
             "AND autoid=#{autoid}"+
            "</if>"
            +"<if test=\"resid!=null and resid!=''\">"+
             "AND resid=#{resid}"+
            "</if>"
            +"<if test=\"resname!=null and resname!=''\">"+
             "AND resname=#{resname}"+
            "</if>"
            +"<if test=\"domainid!=null and domainid!=''\">"+
             "AND domainid=#{domainid}"+
            "</if>"
            +"<if test=\"groupid!=null and groupid!=''\">"+
             "AND groupid=#{groupid}"+
            "</if>"
            +"<if test=\"proxyid!=null and proxyid!=''\">"+
             "AND proxyid=#{proxyid}"+
            "</if>"
            +"<if test=\"longitude!=null and longitude!=''\">"+
             "AND longitude=#{longitude}"+
            "</if>"
            +"<if test=\"latitude!=null and latitude!=''\">"+
             "AND latitude=#{latitude}"+
            "</if>"
            +"<if test=\"polygon!=null and polygon!=''\">"+
             "AND polygon=#{polygon}"+
            "</if>"
            +"<if test=\"geometytype!=null and geometytype!=''\">"+
             "AND geometytype=#{geometytype}"+
            "</if>"
            +"<if test=\"restype!=null and restype!=''\">"+
             "AND restype=#{restype}"+
            "</if>"
            +"<if test=\"ressubtype!=null and ressubtype!=''\">"+
             "AND ressubtype=#{ressubtype}"+
            "</if>"
            +"<if test=\"panangle!=null and panangle!=''\">"+
             "AND panangle=#{panangle}"+
            "</if>"
            +"<if test=\"tiltangle!=null and tiltangle!=''\">"+
             "AND tiltangle=#{tiltangle}"+
            "</if>"
            +"<if test=\"comments!=null and comments!=''\">"+
             "AND comments=#{comments}"+
            "</if>"
            +"<if test=\"matrixcamid!=null and matrixcamid!=''\">"+
             "AND matrixcamid=#{matrixcamid}"+
            "</if>"
            +"<if test=\"resourcetype!=null and resourcetype!=''\">"+
             "AND resourcetype=#{resourcetype}"+
            "</if>"
            +"<if test=\"sipdeviceid!=null and sipdeviceid!=''\">"+
             "AND sipdeviceid=#{sipdeviceid}"+
            "</if>"
            +"<if test=\"parentsipid!=null and parentsipid!=''\">"+
             "AND parentsipid=#{parentsipid}"+
            "</if>"
            +"<if test=\"manufacturer!=null and manufacturer!=''\">"+
             "AND manufacturer=#{manufacturer}"+
            "</if>"
            +"<if test=\"model!=null and model!=''\">"+
             "AND model=#{model}"+
            "</if>"
            +"<if test=\"owner!=null and owner!=''\">"+
             "AND owner=#{owner}"+
            "</if>"
            +"<if test=\"civilcode!=null and civilcode!=''\">"+
             "AND civilcode=#{civilcode}"+
            "</if>"
            +"<if test=\"address!=null and address!=''\">"+
             "AND address=#{address}"+
            "</if>"
            +"<if test=\"parental!=null and parental!=''\">"+
             "AND parental=#{parental}"+
            "</if>"
            +"<if test=\"parentid!=null and parentid!=''\">"+
             "AND parentid=#{parentid}"+
            "</if>"
            +"<if test=\"registerway!=null and registerway!=''\">"+
             "AND registerway=#{registerway}"+
            "</if>"
            +"<if test=\"certnum!=null and certnum!=''\">"+
             "AND certnum=#{certnum}"+
            "</if>"
            +"<if test=\"certifiable!=null and certifiable!=''\">"+
             "AND certifiable=#{certifiable}"+
            "</if>"
            +"<if test=\"errcode!=null and errcode!=''\">"+
             "AND errcode=#{errcode}"+
            "</if>"
            +"<if test=\"endtime!=null and endtime!=''\">"+
             "AND endtime=#{endtime}"+
            "</if>"
            +"<if test=\"secrecy!=null and secrecy!=''\">"+
             "AND secrecy=#{secrecy}"+
            "</if>"
            +"<if test=\"safetyway!=null and safetyway!=''\">"+
             "AND safetyway=#{safetyway}"+
            "</if>"
            +"<if test=\"block!=null and block!=''\">"+
             "AND block=#{block}"+
            "</if>"
            +"<if test=\"sippassword!=null and sippassword!=''\">"+
             "AND sippassword=#{sippassword}"+
            "</if>"
            +"<if test=\"ifonline!=null and ifonline!=''\">"+
             "AND ifonline=#{ifonline}"+
            "</if>"
            +"<if test=\"sipip!=null and sipip!=''\">"+
             "AND sipip=#{sipip}"+
            "</if>"
            +"<if test=\"sipport!=null and sipport!=''\">"+
             "AND sipport=#{sipport}"+
            "</if>"
            +"<if test=\"priorityprotocol!=null and priorityprotocol!=''\">"+
             "AND priorityprotocol=#{priorityprotocol}"+
            "</if>"
            +"<if test=\"devicetime!=null and devicetime!=''\">"+
             "AND devicetime=#{devicetime}"+
            "</if>"
            +"<if test=\"record!=null and record!=''\">"+
             "AND record=#{record}"+
            "</if>"
            +"<if test=\"status!=null and status!=''\">"+
             "AND status=#{status}"+
            "</if>"
            +"<if test=\"encode!=null and encode!=''\">"+
             "AND encode=#{encode}"+
            "</if>"
            +"<if test=\"firmware!=null and firmware!=''\">"+
             "AND firmware=#{firmware}"+
            "</if>"
            +"</script>")
    List<TblResAttr> queryList(Map<String, Object> map);

    @Select("select * from tbl_res_attr")
    List<TblResAttr> queryForAllObject(TblResAttr baseModel);

    @Insert("<script>INSERT INTO tbl_res_attr (autoid,resid,resname,domainid,groupid,proxyid,longitude,latitude,polygon,geometytype,restype,ressubtype,panangle,tiltangle,comments,matrixcamid,resourcetype,sipdeviceid,parentsipid,manufacturer,model,owner,civilcode,address,parental,parentid,registerway,certnum,certifiable,errcode,endtime,secrecy,safetyway,block,sippassword,ifonline,sipip,sipport,priorityprotocol,devicetime,record,status,encode,firmware) values "
            +"(#{autoid},#{resid},#{resname},#{domainid},#{groupid},#{proxyid},#{longitude},#{latitude},#{polygon},#{geometytype},#{restype},#{ressubtype},#{panangle},#{tiltangle},#{comments},#{matrixcamid},#{resourcetype},#{sipdeviceid},#{parentsipid},#{manufacturer},#{model},#{owner},#{civilcode},#{address},#{parental},#{parentid},#{registerway},#{certnum},#{certifiable},#{errcode},#{endtime},#{secrecy},#{safetyway},#{block},#{sippassword},#{ifonline},#{sipip},#{sipport},#{priorityprotocol},#{devicetime},#{record},#{status},#{encode},#{firmware})</script>")
    void save(TblResAttr tblResAttr);

    @Update("<script>UPDATE tbl_res_attr set autoid=#{autoid},resid=#{resid},resname=#{resname},domainid=#{domainid},groupid=#{groupid},proxyid=#{proxyid},longitude=#{longitude},latitude=#{latitude},polygon=#{polygon},geometytype=#{geometytype},restype=#{restype},ressubtype=#{ressubtype},panangle=#{panangle},tiltangle=#{tiltangle},comments=#{comments},matrixcamid=#{matrixcamid},resourcetype=#{resourcetype},sipdeviceid=#{sipdeviceid},parentsipid=#{parentsipid},manufacturer=#{manufacturer},model=#{model},owner=#{owner},civilcode=#{civilcode},address=#{address},parental=#{parental},parentid=#{parentid},registerway=#{registerway},certnum=#{certnum},certifiable=#{certifiable},errcode=#{errcode},endtime=#{endtime},secrecy=#{secrecy},safetyway=#{safetyway},block=#{block},sippassword=#{sippassword},ifonline=#{ifonline},sipip=#{sipip},sipport=#{sipport},priorityprotocol=#{priorityprotocol},devicetime=#{devicetime},record=#{record},status=#{status},encode=#{encode},firmware=#{firmware} where autoid =#{autoid}</script>")
    void update(TblResAttr tblResAttr);

    @Delete("<script>DELETE FROM tbl_res_attr where autoid =#{autoid}</script>")
    void delete(Integer autoid);

    @Delete("DELETE FROM tbl_res_attr WHERE autoid IN (1,2)")
    void deleteBatch(Integer[] autoids);

    @Select("<script>SELECT  count(*) FROM sys_account WHERE 1=1"
            +"<if test=\"autoid!=null and autoid!=''\">"+
             "AND autoid=#{autoid}"+
            "</if>"
            +"<if test=\"resid!=null and resid!=''\">"+
             "AND resid=#{resid}"+
            "</if>"
            +"<if test=\"resname!=null and resname!=''\">"+
             "AND resname=#{resname}"+
            "</if>"
            +"<if test=\"domainid!=null and domainid!=''\">"+
             "AND domainid=#{domainid}"+
            "</if>"
            +"<if test=\"groupid!=null and groupid!=''\">"+
             "AND groupid=#{groupid}"+
            "</if>"
            +"<if test=\"proxyid!=null and proxyid!=''\">"+
             "AND proxyid=#{proxyid}"+
            "</if>"
            +"<if test=\"longitude!=null and longitude!=''\">"+
             "AND longitude=#{longitude}"+
            "</if>"
            +"<if test=\"latitude!=null and latitude!=''\">"+
             "AND latitude=#{latitude}"+
            "</if>"
            +"<if test=\"polygon!=null and polygon!=''\">"+
             "AND polygon=#{polygon}"+
            "</if>"
            +"<if test=\"geometytype!=null and geometytype!=''\">"+
             "AND geometytype=#{geometytype}"+
            "</if>"
            +"<if test=\"restype!=null and restype!=''\">"+
             "AND restype=#{restype}"+
            "</if>"
            +"<if test=\"ressubtype!=null and ressubtype!=''\">"+
             "AND ressubtype=#{ressubtype}"+
            "</if>"
            +"<if test=\"panangle!=null and panangle!=''\">"+
             "AND panangle=#{panangle}"+
            "</if>"
            +"<if test=\"tiltangle!=null and tiltangle!=''\">"+
             "AND tiltangle=#{tiltangle}"+
            "</if>"
            +"<if test=\"comments!=null and comments!=''\">"+
             "AND comments=#{comments}"+
            "</if>"
            +"<if test=\"matrixcamid!=null and matrixcamid!=''\">"+
             "AND matrixcamid=#{matrixcamid}"+
            "</if>"
            +"<if test=\"resourcetype!=null and resourcetype!=''\">"+
             "AND resourcetype=#{resourcetype}"+
            "</if>"
            +"<if test=\"sipdeviceid!=null and sipdeviceid!=''\">"+
             "AND sipdeviceid=#{sipdeviceid}"+
            "</if>"
            +"<if test=\"parentsipid!=null and parentsipid!=''\">"+
             "AND parentsipid=#{parentsipid}"+
            "</if>"
            +"<if test=\"manufacturer!=null and manufacturer!=''\">"+
             "AND manufacturer=#{manufacturer}"+
            "</if>"
            +"<if test=\"model!=null and model!=''\">"+
             "AND model=#{model}"+
            "</if>"
            +"<if test=\"owner!=null and owner!=''\">"+
             "AND owner=#{owner}"+
            "</if>"
            +"<if test=\"civilcode!=null and civilcode!=''\">"+
             "AND civilcode=#{civilcode}"+
            "</if>"
            +"<if test=\"address!=null and address!=''\">"+
             "AND address=#{address}"+
            "</if>"
            +"<if test=\"parental!=null and parental!=''\">"+
             "AND parental=#{parental}"+
            "</if>"
            +"<if test=\"parentid!=null and parentid!=''\">"+
             "AND parentid=#{parentid}"+
            "</if>"
            +"<if test=\"registerway!=null and registerway!=''\">"+
             "AND registerway=#{registerway}"+
            "</if>"
            +"<if test=\"certnum!=null and certnum!=''\">"+
             "AND certnum=#{certnum}"+
            "</if>"
            +"<if test=\"certifiable!=null and certifiable!=''\">"+
             "AND certifiable=#{certifiable}"+
            "</if>"
            +"<if test=\"errcode!=null and errcode!=''\">"+
             "AND errcode=#{errcode}"+
            "</if>"
            +"<if test=\"endtime!=null and endtime!=''\">"+
             "AND endtime=#{endtime}"+
            "</if>"
            +"<if test=\"secrecy!=null and secrecy!=''\">"+
             "AND secrecy=#{secrecy}"+
            "</if>"
            +"<if test=\"safetyway!=null and safetyway!=''\">"+
             "AND safetyway=#{safetyway}"+
            "</if>"
            +"<if test=\"block!=null and block!=''\">"+
             "AND block=#{block}"+
            "</if>"
            +"<if test=\"sippassword!=null and sippassword!=''\">"+
             "AND sippassword=#{sippassword}"+
            "</if>"
            +"<if test=\"ifonline!=null and ifonline!=''\">"+
             "AND ifonline=#{ifonline}"+
            "</if>"
            +"<if test=\"sipip!=null and sipip!=''\">"+
             "AND sipip=#{sipip}"+
            "</if>"
            +"<if test=\"sipport!=null and sipport!=''\">"+
             "AND sipport=#{sipport}"+
            "</if>"
            +"<if test=\"priorityprotocol!=null and priorityprotocol!=''\">"+
             "AND priorityprotocol=#{priorityprotocol}"+
            "</if>"
            +"<if test=\"devicetime!=null and devicetime!=''\">"+
             "AND devicetime=#{devicetime}"+
            "</if>"
            +"<if test=\"record!=null and record!=''\">"+
             "AND record=#{record}"+
            "</if>"
            +"<if test=\"status!=null and status!=''\">"+
             "AND status=#{status}"+
            "</if>"
            +"<if test=\"encode!=null and encode!=''\">"+
             "AND encode=#{encode}"+
            "</if>"
            +"<if test=\"firmware!=null and firmware!=''\">"+
             "AND firmware=#{firmware}"+
            "</if>"
            +"</script>")
    int queryTotal(Map<String, Object> map);
	
}
