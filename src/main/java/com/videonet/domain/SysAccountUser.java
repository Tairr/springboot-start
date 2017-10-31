package com.videonet.domain;

import com.videonet.comm.base.SerializID;


/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-30 15:41:53
 */
public class SysAccountUser  extends SerializID {

	//
	private String accountId;
	//
	private String userId;


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
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
}
