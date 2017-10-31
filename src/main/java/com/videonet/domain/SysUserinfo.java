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
public class SysUserinfo  {
	

	//用户姓名
	private String realname;
	//性别
	private String gender;
	//民族
	private String nation;
	//籍贯
	private String nativeplace;
	//出生日期
	private String birthdate;
	//政治面貌
	private String politicalstatus;
	//婚姻状况
	private String maritalstatus;
	//昵称
	private String nickname;
	//头像
	private String picture;
	//电话号码(唯一)
	private String phone;
	//邮箱
	private String mail;
	//部门
	private String org;
	//警号
	private String policenum;
	//身份证号
	private String identitycode;
	//二维码
	private String qr;
	//qq号
	private String qq;
	//微信号
	private String wechat;
	//职务代码
	private String jobcode;
	//职称
	private String station;
	//个性签名
	private String autograph;
	//家庭住址
	private String homeAddress;
	//办公地址
	private String officeAddress;
	//其他地址
	private String otherAddress;
	//办公电话
	private String officetelephone;
	//其他联系电话
	private String othertelephone;
	//开启号码隐藏
	private Integer ifhideNum;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String ifuse;
	//
	private Integer orderNum;
	//部门id
	private String orgid;


	/**
	 * 设置：用户姓名
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getRealname() {
		return realname;
	}
	/**
	 * 设置：性别
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 获取：性别
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 设置：民族
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}
	/**
	 * 获取：民族
	 */
	public String getNation() {
		return nation;
	}
	/**
	 * 设置：籍贯
	 */
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}
	/**
	 * 获取：籍贯
	 */
	public String getNativeplace() {
		return nativeplace;
	}
	/**
	 * 设置：出生日期
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * 获取：出生日期
	 */
	public String getBirthdate() {
		return birthdate;
	}
	/**
	 * 设置：政治面貌
	 */
	public void setPoliticalstatus(String politicalstatus) {
		this.politicalstatus = politicalstatus;
	}
	/**
	 * 获取：政治面貌
	 */
	public String getPoliticalstatus() {
		return politicalstatus;
	}
	/**
	 * 设置：婚姻状况
	 */
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	/**
	 * 获取：婚姻状况
	 */
	public String getMaritalstatus() {
		return maritalstatus;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：头像
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * 获取：头像
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * 设置：电话号码(唯一)
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话号码(唯一)
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：邮箱
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * 获取：邮箱
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * 设置：部门
	 */
	public void setOrg(String org) {
		this.org = org;
	}
	/**
	 * 获取：部门
	 */
	public String getOrg() {
		return org;
	}
	/**
	 * 设置：警号
	 */
	public void setPolicenum(String policenum) {
		this.policenum = policenum;
	}
	/**
	 * 获取：警号
	 */
	public String getPolicenum() {
		return policenum;
	}
	/**
	 * 设置：身份证号
	 */
	public void setIdentitycode(String identitycode) {
		this.identitycode = identitycode;
	}
	/**
	 * 获取：身份证号
	 */
	public String getIdentitycode() {
		return identitycode;
	}
	/**
	 * 设置：二维码
	 */
	public void setQr(String qr) {
		this.qr = qr;
	}
	/**
	 * 获取：二维码
	 */
	public String getQr() {
		return qr;
	}
	/**
	 * 设置：qq号
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
	/**
	 * 获取：qq号
	 */
	public String getQq() {
		return qq;
	}
	/**
	 * 设置：微信号
	 */
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	/**
	 * 获取：微信号
	 */
	public String getWechat() {
		return wechat;
	}
	/**
	 * 设置：职务代码
	 */
	public void setJobcode(String jobcode) {
		this.jobcode = jobcode;
	}
	/**
	 * 获取：职务代码
	 */
	public String getJobcode() {
		return jobcode;
	}
	/**
	 * 设置：职称
	 */
	public void setStation(String station) {
		this.station = station;
	}
	/**
	 * 获取：职称
	 */
	public String getStation() {
		return station;
	}
	/**
	 * 设置：个性签名
	 */
	public void setAutograph(String autograph) {
		this.autograph = autograph;
	}
	/**
	 * 获取：个性签名
	 */
	public String getAutograph() {
		return autograph;
	}
	/**
	 * 设置：家庭住址
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	/**
	 * 获取：家庭住址
	 */
	public String getHomeAddress() {
		return homeAddress;
	}
	/**
	 * 设置：办公地址
	 */
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	/**
	 * 获取：办公地址
	 */
	public String getOfficeAddress() {
		return officeAddress;
	}
	/**
	 * 设置：其他地址
	 */
	public void setOtherAddress(String otherAddress) {
		this.otherAddress = otherAddress;
	}
	/**
	 * 获取：其他地址
	 */
	public String getOtherAddress() {
		return otherAddress;
	}
	/**
	 * 设置：办公电话
	 */
	public void setOfficetelephone(String officetelephone) {
		this.officetelephone = officetelephone;
	}
	/**
	 * 获取：办公电话
	 */
	public String getOfficetelephone() {
		return officetelephone;
	}
	/**
	 * 设置：其他联系电话
	 */
	public void setOthertelephone(String othertelephone) {
		this.othertelephone = othertelephone;
	}
	/**
	 * 获取：其他联系电话
	 */
	public String getOthertelephone() {
		return othertelephone;
	}
	/**
	 * 设置：开启号码隐藏
	 */
	public void setIfhideNum(Integer ifhideNum) {
		this.ifhideNum = ifhideNum;
	}
	/**
	 * 获取：开启号码隐藏
	 */
	public Integer getIfhideNum() {
		return ifhideNum;
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
	/**
	 * 设置：部门id
	 */
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}
	/**
	 * 获取：部门id
	 */
	public String getOrgid() {
		return orgid;
	}
}
