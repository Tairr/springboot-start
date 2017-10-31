package com.videonet.service.impl;

import com.videonet.dao.ISysRoleAuthorityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysRoleAuthority;
import com.videonet.service.SysRoleAuthorityService;



@Service("sysRoleAuthorityService")
public class SysRoleAuthorityServiceImpl implements SysRoleAuthorityService {

	@Autowired
	private ISysRoleAuthorityDao sysRoleAuthorityDao;
	
	@Override
	public SysRoleAuthority findById(String id){
		return sysRoleAuthorityDao.findById(id);
	}
	
	@Override
	public List<SysRoleAuthority> queryList(Map<String, Object> map){
		return sysRoleAuthorityDao.queryList(map);
	}
	
	@Override
	public void save(SysRoleAuthority sysRoleAuthority){
		sysRoleAuthorityDao.save(sysRoleAuthority);
	}
	
	@Override
	public void update(SysRoleAuthority sysRoleAuthority){
		sysRoleAuthorityDao.update(sysRoleAuthority);
	}
	
	@Override
	public void delete(String id){
		sysRoleAuthorityDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysRoleAuthorityDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysRoleAuthorityDao.queryTotal(map);
    }
	
}
