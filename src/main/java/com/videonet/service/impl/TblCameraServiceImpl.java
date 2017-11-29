package com.videonet.service.impl;

import com.videonet.cdao.ITblCameraDao;
import com.videonet.cdomain.TblCamera;
import com.videonet.service.TblCameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("tblCameraService")
public class TblCameraServiceImpl implements TblCameraService {

	@Autowired
	private ITblCameraDao tblCameraDao;

	@Override
	public void save(TblCamera tblResAttr){
		tblCameraDao.tSave(tblResAttr);
	}
	
}
