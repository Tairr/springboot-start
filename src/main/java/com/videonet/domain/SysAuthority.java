package com.videonet.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-30 15:41:53
 */
public class SysAuthority  {

	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String ifUse;
	//
	private String authorityName;
	//
	private String description;
	//
	private Integer orderNum;

	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setIfUse(String ifUse) {
		this.ifUse = ifUse;
	}
	/**
	 * 获取：
	 */
	public String getIfUse() {
		return ifUse;
	}
	/**
	 * 设置：
	 */
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	/**
	 * 获取：
	 */
	public String getAuthorityName() {
		return authorityName;
	}
	/**
	 * 设置：
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：
	 */
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：
	 */
	public Integer getOrderNum() {
		return orderNum;
	}
}
