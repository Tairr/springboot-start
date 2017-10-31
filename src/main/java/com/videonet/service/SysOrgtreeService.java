package com.videonet.service;

import com.videonet.domain.SysOrgtree;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysOrgtreeService {
	
	SysOrgtree findById(String id);
	
	List<SysOrgtree> queryList(Map<String, Object> map);
	
	void save(SysOrgtree sysOrgtree);
	
	void update(SysOrgtree sysOrgtree);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
