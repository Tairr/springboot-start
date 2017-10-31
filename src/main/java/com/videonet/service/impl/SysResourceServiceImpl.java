package com.videonet.service.impl;

import com.videonet.dao.ISysResourceDao;
import com.videonet.domain.SysAuthority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysResource;
import com.videonet.service.SysResourceService;



@Service("sysResourceService")
public class SysResourceServiceImpl implements SysResourceService {

	@Autowired
	private ISysResourceDao sysResourceDao;
	
	@Override
	public SysResource findById(String id){
		return sysResourceDao.findById(id);
	}
	
	@Override
	public List<SysResource> queryList(Map<String, Object> map){
		return sysResourceDao.queryList(map);
	}
	
	@Override
	public void save(SysResource sysResource){
		sysResourceDao.save(sysResource);
	}
	
	@Override
	public void update(SysResource sysResource){
		sysResourceDao.update(sysResource);
	}
	
	@Override
	public void delete(String id){
		sysResourceDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysResourceDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysResourceDao.queryTotal(map);
    }

	@Override
	public List<SysResource> getAccountAuthorities(String username){
		return sysResourceDao.getAccountAuthorities(username);
	}
}
