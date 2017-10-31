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
public class SysOrg  {

	//
	private String orgName;
	//
	private String leader;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String ifUse;
	//
	private Integer orderNum;
	//
	private String parentId;
	//
	private String parentName;
	//
	private String path;


	/**
	 * 设置：
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * 获取：
	 */
	public String getOrgName() {
		return orgName;
	}
	/**
	 * 设置：
	 */
	public void setLeader(String leader) {
		this.leader = leader;
	}
	/**
	 * 获取：
	 */
	public String getLeader() {
		return leader;
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
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：
	 */
	public Integer getOrderNum() {
		return orderNum;
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
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：
	 */
	public String getPath() {
		return path;
	}
}
