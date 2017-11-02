package com.videonet.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.videonet.cdomain.TblDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.videonet.service.TblDomainService;
import com.videonet.util.PageUtils;
import com.videonet.util.Query;
import com.videonet.util.ReturnMap;




/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:02:31
 */
@RestController
@RequestMapping("/tbldomain")
public class TblDomainController {
	@Autowired
	private TblDomainService tblDomainService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ReturnMap list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<TblDomain> tblDomainList = tblDomainService.queryList(query);
		int total = tblDomainService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(tblDomainList, total, query.getLimit(), query.getPage());
		
		return ReturnMap.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{domainid}")
	public ReturnMap info(@PathVariable("domainid") BigDecimal domainid){
		TblDomain tblDomain = tblDomainService.findById(domainid);
		
		return ReturnMap.ok().put("tblDomain", tblDomain);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ReturnMap save(@RequestBody TblDomain tblDomain){
		tblDomainService.save(tblDomain);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ReturnMap update(@RequestBody TblDomain tblDomain){
		tblDomainService.update(tblDomain);
		
		return ReturnMap.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ReturnMap delete(@RequestBody BigDecimal[] domainids){
		tblDomainService.deleteBatch(domainids);
		
		return ReturnMap.ok();
	}
	
}
