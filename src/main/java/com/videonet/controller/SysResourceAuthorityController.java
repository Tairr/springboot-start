package com.videonet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.videonet.domain.SysResourceAuthority;
import com.videonet.service.SysResourceAuthorityService;
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
@RequestMapping("/sysresourceauthority")
public class SysResourceAuthorityController {
	@Autowired
	private SysResourceAuthorityService sysResourceAuthorityService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysResourceAuthority> sysResourceAuthorityList = sysResourceAuthorityService.queryList(query);
		int total = sysResourceAuthorityService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysResourceAuthorityList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ReturnMap info(@PathVariable("id") String id){
		SysResourceAuthority sysResourceAuthority = sysResourceAuthorityService.findById(id);
		
		return ReturnMap.ok().put("sysResourceAuthority", sysResourceAuthority);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody SysResourceAuthority sysResourceAuthority){
		sysResourceAuthorityService.save(sysResourceAuthority);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody SysResourceAuthority sysResourceAuthority){
		sysResourceAuthorityService.update(sysResourceAuthority);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody String[] ids){
		sysResourceAuthorityService.deleteBatch(ids);
		
		return ReturnMap.ok();
	}
	
}
