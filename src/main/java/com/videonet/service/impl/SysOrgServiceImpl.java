package com.videonet.service.impl;

import com.videonet.dao.ISysOrgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysOrg;
import com.videonet.service.SysOrgService;



@Service("sysOrgService")
public class SysOrgServiceImpl implements SysOrgService {

	@Autowired
	private ISysOrgDao sysOrgDao;
	
	@Override
	public SysOrg findById(String id){
		return sysOrgDao.findById(id);
	}
	
	@Override
	public List<SysOrg> queryList(Map<String, Object> map){
		return sysOrgDao.queryList(map);
	}
	
	@Override
	public void save(SysOrg sysOrg){
		sysOrgDao.save(sysOrg);
	}
	
	@Override
	public void update(SysOrg sysOrg){
		sysOrgDao.update(sysOrg);
	}
	
	@Override
	public void delete(String id){
		sysOrgDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysOrgDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysOrgDao.queryTotal(map);
    }
	
}
