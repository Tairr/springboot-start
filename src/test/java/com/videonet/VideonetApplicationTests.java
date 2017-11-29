package com.videonet;

import com.videonet.cdao.ITblCameraDao;
import com.videonet.cdao.ITblResAttrDao;
import com.videonet.cdomain.TblResAttr;
import com.videonet.domain.SysAccount;
import com.videonet.service.SysAccountService;
import com.videonet.util.TimeUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class VideonetApplicationTests {

	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	SysAccountService sysAccountService;


	@Autowired
	ITblCameraDao tblCameraDao;
	@Autowired
	ITblResAttrDao tblResAttrDao;

	@Test
	public void contextLoads() {
		SysAccount account = new SysAccount();
		account.setUsername("zhangsan");
		account.setPassword("111111");
		account.setSalt("111111");
 		sysAccountService.save(account);
	}

	@Test
	public void del() {
		sysAccountService.delete("222");
	}


	@Test
	public void produceData() throws ParseException {

		System.out.println("开始生产数据："+ TimeUtils.dateToStr(Calendar.getInstance().getTime()));

//		for(int i=0;i<200000;i++){
//			TblResAttr resAttr = new TblResAttr();
//			resAttr.setDeviceId(i+"20000");
//			resAttr.setName("测试数据"+i);
//			tblResAttrDao.tSave(resAttr);
//		}

	}


	@Test
	public void testSaveAll() throws ParseException {
		List<SysAccount> accounts = new ArrayList<>();
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

		System.err.println("开始list："+TimeUtils.dateToStr(new Date(System.currentTimeMillis())));
		for(int i=0;i<2000;i++){
			System.out.println("list add:"+i);
			SysAccount account = new SysAccount();
			account.setUsername("2test"+i);
			account.setPassword(bCryptPasswordEncoder.encode("111111"));
			account.setSalt("111111");
			accounts.add(account);
		}
		System.err.println("结束list："+TimeUtils.dateToStr(new Date(System.currentTimeMillis())));
		System.err.println("开始save："+TimeUtils.dateToStr(new Date(System.currentTimeMillis())));
//		sysAccountService.saveAll(accounts);
		System.err.println("结束save："+TimeUtils.dateToStr(new Date(System.currentTimeMillis())));
	}



	@Test
	public void testLog4j(){
		logger.info("输出info");
		logger.debug("输出debug++++");
		logger.error("输出error+++++++====");
	}

}
