package com.videonet.service.impl;

import com.videonet.dao.ISysUserinfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysUserinfo;
import com.videonet.service.SysUserinfoService;



@Service("sysUserinfoService")
public class SysUserinfoServiceImpl implements SysUserinfoService {

	@Autowired
	private ISysUserinfoDao sysUserinfoDao;
	
	@Override
	public SysUserinfo findById(String id){
		return sysUserinfoDao.findById(id);
	}
	
	@Override
	public List<SysUserinfo> queryList(Map<String, Object> map){
		return sysUserinfoDao.queryList(map);
	}
	
	@Override
	public void save(SysUserinfo sysUserinfo){
		sysUserinfoDao.save(sysUserinfo);
	}
	
	@Override
	public void update(SysUserinfo sysUserinfo){
		sysUserinfoDao.update(sysUserinfo);
	}
	
	@Override
	public void delete(String id){
		sysUserinfoDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysUserinfoDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysUserinfoDao.queryTotal(map);
    }
	
}
