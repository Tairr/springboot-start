package com.videonet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.videonet.domain.SysAuthority;
import com.videonet.service.SysAuthorityService;
import com.videonet.util.PageUtils;
import com.videonet.util.Query;
import com.videonet.util.ReturnMap;




/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-29 11:35:19
 */
@RestController
@RequestMapping("/sysauthority")
public class SysAuthorityController {
	@Autowired
	private SysAuthorityService sysAuthorityService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysAuthority> sysAuthorityList = sysAuthorityService.queryList(query);
		int total = sysAuthorityService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysAuthorityList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ReturnMap info(@PathVariable("id") String id){
		SysAuthority sysAuthority = sysAuthorityService.findById(id);
		
		return ReturnMap.ok().put("sysAuthority", sysAuthority);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody SysAuthority sysAuthority){
		sysAuthorityService.save(sysAuthority);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody SysAuthority sysAuthority){
		sysAuthorityService.update(sysAuthority);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody String[] ids){
		sysAuthorityService.deleteBatch(ids);
		
		return ReturnMap.ok();
	}
	
}
