package com.videonet.service;

import com.videonet.domain.SysAccountUser;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:37:40
 */
public interface SysAccountUserService {
	
	SysAccountUser findById(String id);
	
	List<SysAccountUser> queryList(Map<String, Object> map);
	
	void save(SysAccountUser sysAccountUser);
	
	void update(SysAccountUser sysAccountUser);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
