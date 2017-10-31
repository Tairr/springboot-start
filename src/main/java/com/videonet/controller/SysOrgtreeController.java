package com.videonet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.videonet.domain.SysOrgtree;
import com.videonet.service.SysOrgtreeService;
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
@RequestMapping("/sysorgtree")
public class SysOrgtreeController {
	@Autowired
	private SysOrgtreeService sysOrgtreeService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysOrgtree> sysOrgtreeList = sysOrgtreeService.queryList(query);
		int total = sysOrgtreeService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysOrgtreeList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ReturnMap info(@PathVariable("id") String id){
		SysOrgtree sysOrgtree = sysOrgtreeService.findById(id);
		
		return ReturnMap.ok().put("sysOrgtree", sysOrgtree);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody SysOrgtree sysOrgtree){
		sysOrgtreeService.save(sysOrgtree);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody SysOrgtree sysOrgtree){
		sysOrgtreeService.update(sysOrgtree);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody String[] ids){
		sysOrgtreeService.deleteBatch(ids);
		
		return ReturnMap.ok();
	}
	
}
