package com.videonet.service;

import com.videonet.domain.SysAccount;
import com.videonet.domain.SysAuthority;

import java.util.List;
import java.util.Map;

/**
 * 账户信息
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:37:40
 */
public interface SysAccountService {
	
	SysAccount findById(String id);
	
	List<SysAccount> queryList(Map<String, Object> map);
	
	void save(SysAccount sysAccount);

	void saveAll(List<SysAccount> accounts);
	
	void update(SysAccount sysAccount);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    int queryTotal(Map<String, Object> map);

}
