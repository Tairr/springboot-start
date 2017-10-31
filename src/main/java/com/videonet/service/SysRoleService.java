package com.videonet.service;

import com.videonet.domain.SysRole;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysRoleService {
	
	SysRole findById(String id);
	
	List<SysRole> queryList(Map<String, Object> map);
	
	void save(SysRole sysRole);
	
	void update(SysRole sysRole);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
