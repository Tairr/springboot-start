package com.videonet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.videonet.domain.SysUserinfo;
import com.videonet.service.SysUserinfoService;
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
@RequestMapping("/sysuserinfo")
public class SysUserinfoController {
	@Autowired
	private SysUserinfoService sysUserinfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysUserinfo> sysUserinfoList = sysUserinfoService.queryList(query);
		int total = sysUserinfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysUserinfoList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ReturnMap info(@PathVariable("id") String id){
		SysUserinfo sysUserinfo = sysUserinfoService.findById(id);
		
		return ReturnMap.ok().put("sysUserinfo", sysUserinfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody SysUserinfo sysUserinfo){
		sysUserinfoService.save(sysUserinfo);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody SysUserinfo sysUserinfo){
		sysUserinfoService.update(sysUserinfo);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody String[] ids){
		sysUserinfoService.deleteBatch(ids);
		
		return ReturnMap.ok();
	}
	
}
