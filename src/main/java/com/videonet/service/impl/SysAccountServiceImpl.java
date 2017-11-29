package com.videonet.service.impl;

import com.videonet.dao.ISysAccountDao;
import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.videonet.domain.SysAccount;
import com.videonet.service.SysAccountService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("sysAccountService")
public class SysAccountServiceImpl implements SysAccountService {

	@Autowired
	private ISysAccountDao sysAccountDao;
	@Resource(name="masterSqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
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
	@Transactional
	public void saveAll(List<SysAccount> accounts){
//		for(SysAccount account :accounts){
//			sysAccountDao.save(account);
//		}
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ISysAccountDao accountDao = sqlSession.getMapper(ISysAccountDao.class);
			for(SysAccount account:accounts){
				accountDao.save(account);
			}
			sqlSession.commit();
		}finally {
			sqlSession.close();
		}
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
