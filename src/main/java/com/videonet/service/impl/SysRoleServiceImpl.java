package com.videonet.service.impl;

import com.videonet.dao.ISysRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysRole;
import com.videonet.service.SysRoleService;



@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private ISysRoleDao sysRoleDao;
	
	@Override
	public SysRole findById(String id){
		return sysRoleDao.findById(id);
	}
	
	@Override
	public List<SysRole> queryList(Map<String, Object> map){
		return sysRoleDao.queryList(map);
	}
	
	@Override
	public void save(SysRole sysRole){
		sysRoleDao.save(sysRole);
	}
	
	@Override
	public void update(SysRole sysRole){
		sysRoleDao.update(sysRole);
	}
	
	@Override
	public void delete(String id){
		sysRoleDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysRoleDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysRoleDao.queryTotal(map);
    }
	
}
