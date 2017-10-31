package com.videonet.service.impl;

import com.videonet.dao.ISysAccountUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysAccountUser;
import com.videonet.service.SysAccountUserService;



@Service("sysAccountUserService")
public class SysAccountUserServiceImpl implements SysAccountUserService {

	@Autowired
	private ISysAccountUserDao sysAccountUserDao;
	
	@Override
	public SysAccountUser findById(String id){
		return sysAccountUserDao.findById(id);
	}
	
	@Override
	public List<SysAccountUser> queryList(Map<String, Object> map){
		return sysAccountUserDao.queryList(map);
	}
	
	@Override
	public void save(SysAccountUser sysAccountUser){
		sysAccountUserDao.save(sysAccountUser);
	}
	
	@Override
	public void update(SysAccountUser sysAccountUser){
		sysAccountUserDao.update(sysAccountUser);
	}
	
	@Override
	public void delete(String id){
		sysAccountUserDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysAccountUserDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysAccountUserDao.queryTotal(map);
    }
	
}
