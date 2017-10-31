package com.videonet.service;

import com.videonet.domain.SysAccountRole;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:37:40
 */
public interface SysAccountRoleService {
	
	SysAccountRole findById(String id);
	
	List<SysAccountRole> queryList(Map<String, Object> map);
	
	void save(SysAccountRole sysAccountRole);
	
	void update(SysAccountRole sysAccountRole);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
