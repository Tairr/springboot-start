package com.videonet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.videonet.domain.SysAccountRole;
import com.videonet.service.SysAccountRoleService;
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
@RequestMapping("/sysaccountrole")
public class SysAccountRoleController {
	@Autowired
	private SysAccountRoleService sysAccountRoleService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysAccountRole> sysAccountRoleList = sysAccountRoleService.queryList(query);
		int total = sysAccountRoleService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysAccountRoleList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ReturnMap info(@PathVariable("id") String id){
		SysAccountRole sysAccountRole = sysAccountRoleService.findById(id);
		
		return ReturnMap.ok().put("sysAccountRole", sysAccountRole);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody SysAccountRole sysAccountRole){
		sysAccountRoleService.save(sysAccountRole);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody SysAccountRole sysAccountRole){
		sysAccountRoleService.update(sysAccountRole);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody String[] ids){
		sysAccountRoleService.deleteBatch(ids);
		
		return ReturnMap.ok();
	}
	
}
