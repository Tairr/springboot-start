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
 * @date 2017-11-02 19:02:31
 */
public class TblDomain  {
	
	//
	private BigDecimal domainid;
	//
	private String domainname;
	//
	private BigDecimal parentid;
	//
	private String domainip;
	//
	private BigDecimal domainport;
	//
	private BigDecimal protocoltype;
	//
	private BigDecimal domaintype;
	//
	private String sipdomainid;
	//
	private String sipserverid;
	//
	private String upregisterpassword;
	//
	private String downregisterpassword;
	//
	private BigDecimal connectstate;
	//
	private BigDecimal ifonline;

	public List<TblGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<TblGroup> groups) {
		this.groups = groups;
	}

	private List<TblGroup> groups;


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
	public void setDomainname(String domainname) {
		this.domainname = domainname;
	}
	/**
	 * 获取：
	 */
	public String getDomainname() {
		return domainname;
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
	public void setDomainip(String domainip) {
		this.domainip = domainip;
	}
	/**
	 * 获取：
	 */
	public String getDomainip() {
		return domainip;
	}
	/**
	 * 设置：
	 */
	public void setDomainport(BigDecimal domainport) {
		this.domainport = domainport;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getDomainport() {
		return domainport;
	}
	/**
	 * 设置：
	 */
	public void setProtocoltype(BigDecimal protocoltype) {
		this.protocoltype = protocoltype;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getProtocoltype() {
		return protocoltype;
	}
	/**
	 * 设置：
	 */
	public void setDomaintype(BigDecimal domaintype) {
		this.domaintype = domaintype;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getDomaintype() {
		return domaintype;
	}
	/**
	 * 设置：
	 */
	public void setSipdomainid(String sipdomainid) {
		this.sipdomainid = sipdomainid;
	}
	/**
	 * 获取：
	 */
	public String getSipdomainid() {
		return sipdomainid;
	}
	/**
	 * 设置：
	 */
	public void setSipserverid(String sipserverid) {
		this.sipserverid = sipserverid;
	}
	/**
	 * 获取：
	 */
	public String getSipserverid() {
		return sipserverid;
	}
	/**
	 * 设置：
	 */
	public void setUpregisterpassword(String upregisterpassword) {
		this.upregisterpassword = upregisterpassword;
	}
	/**
	 * 获取：
	 */
	public String getUpregisterpassword() {
		return upregisterpassword;
	}
	/**
	 * 设置：
	 */
	public void setDownregisterpassword(String downregisterpassword) {
		this.downregisterpassword = downregisterpassword;
	}
	/**
	 * 获取：
	 */
	public String getDownregisterpassword() {
		return downregisterpassword;
	}
	/**
	 * 设置：
	 */
	public void setConnectstate(BigDecimal connectstate) {
		this.connectstate = connectstate;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getConnectstate() {
		return connectstate;
	}
	/**
	 * 设置：
	 */
	public void setIfonline(BigDecimal ifonline) {
		this.ifonline = ifonline;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getIfonline() {
		return ifonline;
	}
}
