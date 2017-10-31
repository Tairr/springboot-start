package com.videonet.service.impl;

import com.videonet.dao.ISysAccountRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysAccountRole;
import com.videonet.service.SysAccountRoleService;



@Service("sysAccountRoleService")
public class SysAccountRoleServiceImpl implements SysAccountRoleService {

	@Autowired
	private ISysAccountRoleDao sysAccountRoleDao;
	
	@Override
	public SysAccountRole findById(String id){
		return sysAccountRoleDao.findById(id);
	}
	
	@Override
	public List<SysAccountRole> queryList(Map<String, Object> map){
		return sysAccountRoleDao.queryList(map);
	}
	
	@Override
	public void save(SysAccountRole sysAccountRole){
		sysAccountRoleDao.save(sysAccountRole);
	}
	
	@Override
	public void update(SysAccountRole sysAccountRole){
		sysAccountRoleDao.update(sysAccountRole);
	}
	
	@Override
	public void delete(String id){
		sysAccountRoleDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysAccountRoleDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysAccountRoleDao.queryTotal(map);
    }
	
}
