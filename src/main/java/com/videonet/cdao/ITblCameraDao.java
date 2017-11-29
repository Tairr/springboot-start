package com.videonet.cdao;

import com.videonet.cdomain.TblCamera;
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
@Repository("tblCameraDao")
public interface ITblCameraDao {


    @Insert("INSERT INTO tbl_camera (ResID) values (#{ResID})")
    void tSave(TblCamera tblCamera);

}
