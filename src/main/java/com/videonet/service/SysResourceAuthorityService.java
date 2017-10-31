package com.videonet.service;

import com.videonet.domain.SysResourceAuthority;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysResourceAuthorityService {
	
	SysResourceAuthority findById(String id);
	
	List<SysResourceAuthority> queryList(Map<String, Object> map);
	
	void save(SysResourceAuthority sysResourceAuthority);
	
	void update(SysResourceAuthority sysResourceAuthority);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
