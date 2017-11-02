package com.videonet.controller;

import java.util.List;
import java.util.Map;

import com.videonet.cdomain.TblGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.videonet.service.TblGroupService;
import com.videonet.util.PageUtils;
import com.videonet.util.Query;
import com.videonet.util.ReturnMap;




/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:02:40
 */
@RestController
@RequestMapping("/tblgroup")
public class TblGroupController {
	@Autowired
	private TblGroupService tblGroupService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<TblGroup> tblGroupList = tblGroupService.queryList(query);
		int total = tblGroupService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(tblGroupList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{autoid}")
	public ReturnMap info(@PathVariable("autoid") Integer autoid){
		TblGroup tblGroup = tblGroupService.findById(autoid);
		
		return ReturnMap.ok().put("tblGroup", tblGroup);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody TblGroup tblGroup){
		tblGroupService.save(tblGroup);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody TblGroup tblGroup){
		tblGroupService.update(tblGroup);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody Integer[] autoids){
		tblGroupService.deleteBatch(autoids);
		
		return ReturnMap.ok();
	}
	
}
