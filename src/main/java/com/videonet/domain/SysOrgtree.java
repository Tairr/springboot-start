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
public class SysOrgtree  {
	

	//
	private String orgId;
	//
	private String childrenId;


	/**
	 * 设置：
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	/**
	 * 获取：
	 */
	public String getOrgId() {
		return orgId;
	}
	/**
	 * 设置：
	 */
	public void setChildrenId(String childrenId) {
		this.childrenId = childrenId;
	}
	/**
	 * 获取：
	 */
	public String getChildrenId() {
		return childrenId;
	}
}
