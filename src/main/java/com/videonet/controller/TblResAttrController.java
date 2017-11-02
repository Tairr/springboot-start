package com.videonet.controller;

import java.util.List;
import java.util.Map;

import com.videonet.cdomain.TblResAttr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.videonet.service.TblResAttrService;
import com.videonet.util.PageUtils;
import com.videonet.util.Query;
import com.videonet.util.ReturnMap;




/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:03:02
 */
@RestController
@RequestMapping("/tblresattr")
public class TblResAttrController {
	@Autowired
	private TblResAttrService tblResAttrService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<TblResAttr> tblResAttrList = tblResAttrService.queryList(query);
		int total = tblResAttrService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(tblResAttrList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{autoid}")
	public ReturnMap info(@PathVariable("autoid") Integer autoid){
		TblResAttr tblResAttr = tblResAttrService.findById(autoid);
		
		return ReturnMap.ok().put("tblResAttr", tblResAttr);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody TblResAttr tblResAttr){
		tblResAttrService.save(tblResAttr);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody TblResAttr tblResAttr){
		tblResAttrService.update(tblResAttr);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody Integer[] autoids){
		tblResAttrService.deleteBatch(autoids);
		
		return ReturnMap.ok();
	}
	
}
