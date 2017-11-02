package com.videonet.cdomain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;


/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:02:40
 */
public class TblGroup  {
	
	//
	private Integer autoid;
	//
	private BigDecimal groupid;
	//
	private String groupname;
	//
	private BigDecimal domainid;
	//
	private BigDecimal parentid;
	//
	private Integer ishasgis;

	private List<TblResAttr> res;

	public List<TblResAttr> getRes() {
		return res;
	}

	public void setRes(List<TblResAttr> res) {
		this.res = res;
	}

	/**
	 * 设置：
	 */
	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
	}
	/**
	 * 获取：
	 */
	public Integer getAutoid() {
		return autoid;
	}
	/**
	 * 设置：
	 */
	public void setGroupid(BigDecimal groupid) {
		this.groupid = groupid;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getGroupid() {
		return groupid;
	}
	/**
	 * 设置：
	 */
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	/**
	 * 获取：
	 */
	public String getGroupname() {
		return groupname;
	}
	/**
	 * 设置：
	 */
	public void setDomainid(BigDecimal domainid) {
		this.domainid = domainid;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getDomainid() {
		return domainid;
	}
	/**
	 * 设置：
	 */
	public void setParentid(BigDecimal parentid) {
		this.parentid = parentid;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getParentid() {
		return parentid;
	}
	/**
	 * 设置：
	 */
	public void setIshasgis(Integer ishasgis) {
		this.ishasgis = ishasgis;
	}
	/**
	 * 获取：
	 */
	public Integer getIshasgis() {
		return ishasgis;
	}
}
