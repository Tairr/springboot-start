package com.videonet.service.impl;

import com.videonet.dao.ISysOrgtreeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysOrgtree;
import com.videonet.service.SysOrgtreeService;



@Service("sysOrgtreeService")
public class SysOrgtreeServiceImpl implements SysOrgtreeService {

	@Autowired
	private ISysOrgtreeDao sysOrgtreeDao;
	
	@Override
	public SysOrgtree findById(String id){
		return sysOrgtreeDao.findById(id);
	}
	
	@Override
	public List<SysOrgtree> queryList(Map<String, Object> map){
		return sysOrgtreeDao.queryList(map);
	}
	
	@Override
	public void save(SysOrgtree sysOrgtree){
		sysOrgtreeDao.save(sysOrgtree);
	}
	
	@Override
	public void update(SysOrgtree sysOrgtree){
		sysOrgtreeDao.update(sysOrgtree);
	}
	
	@Override
	public void delete(String id){
		sysOrgtreeDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		sysOrgtreeDao.deleteBatch(ids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysOrgtreeDao.queryTotal(map);
    }
	
}
