package com.videonet.service;

import com.videonet.cdomain.TblResAttr;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:03:02
 */
public interface TblResAttrService {
	
	TblResAttr findById(Integer autoid);
	
	List<TblResAttr> queryList(Map<String, Object> map);
	
	void save(TblResAttr tblResAttr);
	
	void update(TblResAttr tblResAttr);
	
	void delete(Integer autoid);
	
	void deleteBatch(Integer[] autoids);

    int queryTotal(Map<String, Object> map);
}
