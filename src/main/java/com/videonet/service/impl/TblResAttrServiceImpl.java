package com.videonet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.cdao.ITblResAttrDao;
import com.videonet.cdomain.TblResAttr;
import com.videonet.service.TblResAttrService;



@Service("tblResAttrService")
public class TblResAttrServiceImpl implements TblResAttrService {

	@Autowired
	private ITblResAttrDao tblResAttrDao;
	
	@Override
	public TblResAttr findById(Integer autoid){
		return tblResAttrDao.findById(autoid);
	}
	
	@Override
	public List<TblResAttr> queryList(Map<String, Object> map){
		return tblResAttrDao.queryList(map);
	}
	
	@Override
	public void save(TblResAttr tblResAttr){
		tblResAttrDao.save(tblResAttr);
	}
	
	@Override
	public void update(TblResAttr tblResAttr){
		tblResAttrDao.update(tblResAttr);
	}
	
	@Override
	public void delete(Integer autoid){
		tblResAttrDao.delete(autoid);
	}
	
	@Override
	public void deleteBatch(Integer[] autoids){
		tblResAttrDao.deleteBatch(autoids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return tblResAttrDao.queryTotal(map);
    }
	
}
