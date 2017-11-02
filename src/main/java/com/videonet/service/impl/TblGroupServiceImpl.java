package com.videonet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.cdao.ITblGroupDao;
import com.videonet.cdomain.TblGroup;
import com.videonet.service.TblGroupService;



@Service("tblGroupService")
public class TblGroupServiceImpl implements TblGroupService {

	@Autowired
	private ITblGroupDao tblGroupDao;
	
	@Override
	public TblGroup findById(Integer autoid){
		return tblGroupDao.findById(autoid);
	}
	
	@Override
	public List<TblGroup> queryList(Map<String, Object> map){
		return tblGroupDao.queryList(map);
	}
	
	@Override
	public void save(TblGroup tblGroup){
		tblGroupDao.save(tblGroup);
	}
	
	@Override
	public void update(TblGroup tblGroup){
		tblGroupDao.update(tblGroup);
	}
	
	@Override
	public void delete(Integer autoid){
		tblGroupDao.delete(autoid);
	}
	
	@Override
	public void deleteBatch(Integer[] autoids){
		tblGroupDao.deleteBatch(autoids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return tblGroupDao.queryTotal(map);
    }
	
}
