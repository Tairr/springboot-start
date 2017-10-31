package com.videonet.service.impl;

import com.videonet.dao.ISysResourceAuthorityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysResourceAuthority;
import com.videonet.service.SysResourceAuthorityService;



@Service("sysResourceAuthorityService")
public class SysResourceAuthorityServiceImpl implements SysResourceAuthorityService {

	@Autowired
	private ISysResourceAuthorityDao sysResourceAuthorityDao;
	
	@Override
	public SysResourceAuthority findById(String id){
		return sysResourceAuthorityDao.findById(id);
	}
	
	@Override
	public List<SysResourceAuthority> queryList(Map<String, Object> map){
		return sysResourceAuthorityDao.queryList(map);
	}
	
	@Override
	public void save(SysResourceAuthority sysResourceAuthority){
		sysResourceAuthorityDao.save(sysResourceAuthority);
	}
	
	@Override
	public void update(SysResourceAuthority sysResourceAuthority){
		sysResourceAuthorityDao.update(sysResourceAuthority);
	}
	
	@Override
	public void delete(String id){
		sysResourceAuthorityDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysResourceAuthorityDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysResourceAuthorityDao.queryTotal(map);
    }
	
}
