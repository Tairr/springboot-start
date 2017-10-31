package com.videonet.domain;

import com.videonet.comm.base.SerializID;

import java.util.Date;


/**
 * 账户信息
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-10-30 15:41:53
 */
public class SysAccount extends SerializID {


	//
	private String username;
	//
	private String password;
	//
	private String salt;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String ifUse;
	//
	private String orderNum;
	//
	private String token;
	//
	private String appId;
	//环信ID
	private String communicationid;



	/**
	 * 设置：
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
	/**
	 * 获取：
	 */
	public String getSalt() {
		return salt;
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
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：
	 */
	public String getOrderNum() {
		return orderNum;
	}
	/**
	 * 设置：
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * 获取：
	 */
	public String getToken() {
		return token;
	}
	/**
	 * 设置：
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}
	/**
	 * 获取：
	 */
	public String getAppId() {
		return appId;
	}
	/**
	 * 设置：环信ID
	 */
	public void setCommunicationid(String communicationid) {
		this.communicationid = communicationid;
	}
	/**
	 * 获取：环信ID
	 */
	public String getCommunicationid() {
		return communicationid;
	}
}
