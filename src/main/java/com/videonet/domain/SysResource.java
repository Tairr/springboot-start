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
public class SysResource  {
	

	//
	private String resourceName;
	//
	private String description;
	//
	private String type;
	//
	private String parentId;
	//
	private String parentName;
	//
	private String appName;
	//
	private String url;
	//
	private String level;
	//
	private String isMenuleaf;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String ifuse;
	//
	private Integer orderNum;


	/**
	 * 设置：
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	/**
	 * 获取：
	 */
	public String getResourceName() {
		return resourceName;
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
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	/**
	 * 获取：
	 */
	public String getParentName() {
		return parentName;
	}
	/**
	 * 设置：
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}
	/**
	 * 获取：
	 */
	public String getAppName() {
		return appName;
	}
	/**
	 * 设置：
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * 获取：
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * 设置：
	 */
	public void setIsMenuleaf(String isMenuleaf) {
		this.isMenuleaf = isMenuleaf;
	}
	/**
	 * 获取：
	 */
	public String getIsMenuleaf() {
		return isMenuleaf;
	}
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
	public void setIfuse(String ifuse) {
		this.ifuse = ifuse;
	}
	/**
	 * 获取：
	 */
	public String getIfuse() {
		return ifuse;
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
