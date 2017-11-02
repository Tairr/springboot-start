package com.videonet.service;

import com.videonet.cdomain.TblDomain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:02:31
 */
public interface TblDomainService {
	
	TblDomain findById(BigDecimal domainid);
	
	List<TblDomain> queryList(Map<String, Object> map);
	
	void save(TblDomain tblDomain);
	
	void update(TblDomain tblDomain);
	
	void delete(BigDecimal domainid);
	
	void deleteBatch(BigDecimal[] domainids);

    int queryTotal(Map<String, Object> map);

	List<TblDomain> listTree();
}
