package com.videonet.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.alibaba.druid.pool.DruidDataSource;
import com.videonet.comm.aop.LoggerAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.videonet.domain.SysAccount;
import com.videonet.service.SysAccountService;
import com.videonet.util.PageUtils;
import com.videonet.util.Query;
import com.videonet.util.ReturnMap;




/**
 * 账户信息
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:37:40
 */
@RestController
@RequestMapping("/sysaccount")
public class SysAccountController {

	@Autowired
	private SysAccountService sysAccountService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private DruidDataSource druidDataSource;

	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysAccount> sysAccountList = sysAccountService.queryList(query);
		int total = sysAccountService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysAccountList, total, query.getLimit(), query.getPage());
		System.out.println("druidDataSource.properties:"+druidDataSource.getProperties());
		System.out.println("druidDataSource.filters:"+druidDataSource.getFilterClasses());
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info")
	public ReturnMap info(@RequestParam("id") String id){
		SysAccount sysAccount = sysAccountService.findById(id);
		
		return ReturnMap.ok().put("sysAccount", sysAccount);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody SysAccount sysAccount){
		sysAccountService.save(sysAccount);
		
		return ReturnMap.ok();
	}

	/**
	 * 保存
	 */
	@LoggerAdvice(description = "注册账户")
	@RequestMapping("/register")
	public ReturnMap register(@RequestBody SysAccount sysAccount){

		sysAccount.setSalt(sysAccount.getPassword());
		sysAccount.setPassword(bCryptPasswordEncoder.encode(sysAccount.getPassword()));
		sysAccount.setCreateTime(Calendar.getInstance().getTime());
		sysAccountService.save(sysAccount);
		sysAccount = sysAccountService.findById(sysAccount.getId());

		return ReturnMap.ok().put("new account",sysAccount);
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody SysAccount sysAccount){
		sysAccountService.update(sysAccount);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody String[] ids){
		sysAccountService.deleteBatch(ids);
		
		return ReturnMap.ok();
	}
	
}
