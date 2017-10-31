package com.videonet.service;

import com.videonet.domain.SysRoleAuthority;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysRoleAuthorityService {
	
	SysRoleAuthority findById(String id);
	
	List<SysRoleAuthority> queryList(Map<String, Object> map);
	
	void save(SysRoleAuthority sysRoleAuthority);
	
	void update(SysRoleAuthority sysRoleAuthority);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
