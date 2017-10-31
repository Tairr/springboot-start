package com.videonet;

import com.videonet.domain.SysAccount;
import com.videonet.service.SysAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class VideonetApplicationTests {

	@Autowired
	SysAccountService sysAccountService;

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

}
