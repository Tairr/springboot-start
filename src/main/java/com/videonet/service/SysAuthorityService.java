package com.videonet.service;

import com.videonet.domain.SysAuthority;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysAuthorityService {
	
	SysAuthority findById(String id);
	
	List<SysAuthority> queryList(Map<String, Object> map);
	
	void save(SysAuthority sysAuthority);
	
	void update(SysAuthority sysAuthority);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);


}
