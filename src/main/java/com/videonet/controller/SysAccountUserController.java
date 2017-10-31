package com.videonet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.videonet.domain.SysAccountUser;
import com.videonet.service.SysAccountUserService;
import com.videonet.util.PageUtils;
import com.videonet.util.Query;
import com.videonet.util.ReturnMap;




/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:37:40
 */
@RestController
@RequestMapping("/sysaccountuser")
public class SysAccountUserController {
	@Autowired
	private SysAccountUserService sysAccountUserService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysAccountUser> sysAccountUserList = sysAccountUserService.queryList(query);
		int total = sysAccountUserService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysAccountUserList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ReturnMap info(@PathVariable("id") String id){
		SysAccountUser sysAccountUser = sysAccountUserService.findById(id);
		
		return ReturnMap.ok().put("sysAccountUser", sysAccountUser);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody SysAccountUser sysAccountUser){
		sysAccountUserService.save(sysAccountUser);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody SysAccountUser sysAccountUser){
		sysAccountUserService.update(sysAccountUser);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody String[] ids){
		sysAccountUserService.deleteBatch(ids);
		
		return ReturnMap.ok();
	}
	
}
