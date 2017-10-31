package com.videonet.domain;

import com.videonet.comm.base.SerializID;

/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-30 15:41:53
 */
public class SysAccountRole extends SerializID {
	

	//
	private String accountId;
	//
	private String roleId;


	/**
	 * 设置：
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * 获取：
	 */
	public String getAccountId() {
		return accountId;
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
