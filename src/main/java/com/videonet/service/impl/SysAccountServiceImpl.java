package com.videonet.service.impl;

import com.videonet.dao.ISysAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysAccount;
import com.videonet.service.SysAccountService;



@Service("sysAccountService")
public class SysAccountServiceImpl implements SysAccountService {

	@Autowired
	private ISysAccountDao sysAccountDao;
	
	@Override
	public SysAccount findById(String id){
		return sysAccountDao.findById(id);
	}
	
	@Override
	public List<SysAccount> queryList(Map<String, Object> map){
		return sysAccountDao.queryList(map);
	}
	
	@Override
	public void save(SysAccount sysAccount){
		sysAccountDao.save(sysAccount);
	}
	
	@Override
	public void update(SysAccount sysAccount){
		sysAccountDao.update(sysAccount);
	}
	
	@Override
	public void delete(String id){
		sysAccountDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysAccountDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysAccountDao.queryTotal(map);
    }
	
}
