package com.videonet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.videonet.cdao.ITblDomainDao;
import com.videonet.cdomain.TblDomain;
import com.videonet.service.TblDomainService;



@Service("tblDomainService")
public class TblDomainServiceImpl implements TblDomainService {

	@Autowired
	private ITblDomainDao tblDomainDao;
	
	@Override
	public TblDomain findById(BigDecimal domainid){
		return tblDomainDao.findById(domainid);
	}
	
	@Override
	public List<TblDomain> queryList(Map<String, Object> map){
		return tblDomainDao.queryList(map);
	}
	
	@Override
	public void save(TblDomain tblDomain){
		tblDomainDao.save(tblDomain);
	}
	
	@Override
	public void update(TblDomain tblDomain){
		tblDomainDao.update(tblDomain);
	}
	
	@Override
	public void delete(BigDecimal domainid){
		tblDomainDao.delete(domainid);
	}
	
	@Override
	public void deleteBatch(BigDecimal[] domainids){
		tblDomainDao.deleteBatch(domainids);
	}

    @Override
    public int queryTotal(Map<String, Object> map) {
        return tblDomainDao.queryTotal(map);
    }

    @Override
	public List<TblDomain> listTree(){
		return tblDomainDao.listTree();
	}
}
