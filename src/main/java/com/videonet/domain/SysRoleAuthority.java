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
public class SysRoleAuthority  {
	

	//
	private String authorityId;
	//
	private String roleId;


	/**
	 * 设置：
	 */
	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}
	/**
	 * 获取：
	 */
	public String getAuthorityId() {
		return authorityId;
	}
	/**
	 * 设置：
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：
	 */
	public String getRoleId() {
		return roleId;
	}
}
