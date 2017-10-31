package com.videonet.service;

import com.videonet.domain.SysResource;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysResourceService {
	
	SysResource findById(String id);
	
	List<SysResource> queryList(Map<String, Object> map);
	
	void save(SysResource sysResource);
	
	void update(SysResource sysResource);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);

	List<SysResource> getAccountAuthorities(String username);
}
