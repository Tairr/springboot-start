package com.videonet.service.impl;

import com.videonet.dao.ISysAuthorityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysAuthority;
import com.videonet.service.SysAuthorityService;



@Service("sysAuthorityService")
public class SysAuthorityServiceImpl implements SysAuthorityService {

	@Autowired
	private ISysAuthorityDao sysAuthorityDao;
	
	@Override
	public SysAuthority findById(String id){
		return sysAuthorityDao.findById(id);
	}
	
	@Override
	public List<SysAuthority> queryList(Map<String, Object> map){
		return sysAuthorityDao.queryList(map);
	}
	
	@Override
	public void save(SysAuthority sysAuthority){
		sysAuthorityDao.save(sysAuthority);
	}
	
	@Override
	public void update(SysAuthority sysAuthority){
		sysAuthorityDao.update(sysAuthority);
	}
	
	@Override
	public void delete(String id){
		sysAuthorityDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysAuthorityDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysAuthorityDao.queryTotal(map);
    }

}
