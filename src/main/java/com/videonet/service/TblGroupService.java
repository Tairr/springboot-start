package com.videonet.service;

import com.videonet.cdomain.TblGroup;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:02:40
 */
public interface TblGroupService {
	
	TblGroup findById(Integer autoid);
	
	List<TblGroup> queryList(Map<String, Object> map);
	
	void save(TblGroup tblGroup);
	
	void update(TblGroup tblGroup);
	
	void delete(Integer autoid);
	
	void deleteBatch(Integer[] autoids);

    int queryTotal(Map<String, Object> map);
}
