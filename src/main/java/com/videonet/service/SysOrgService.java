package com.videonet.service;

import com.videonet.domain.SysOrg;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysOrgService {
	
	SysOrg findById(String id);
	
	List<SysOrg> queryList(Map<String, Object> map);
	
	void save(SysOrg sysOrg);
	
	void update(SysOrg sysOrg);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
