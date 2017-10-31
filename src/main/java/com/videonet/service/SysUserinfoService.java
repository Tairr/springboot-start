package com.videonet.service;

import com.videonet.domain.SysUserinfo;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
public interface SysUserinfoService {
	
	SysUserinfo findById(String id);
	
	List<SysUserinfo> queryList(Map<String, Object> map);
	
	void save(SysUserinfo sysUserinfo);
	
	void update(SysUserinfo sysUserinfo);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);
}
