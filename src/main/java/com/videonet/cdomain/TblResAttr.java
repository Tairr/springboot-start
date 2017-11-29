package com.videonet.cdomain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * 
 * @author tangjinhui
 * @email 100274718@qq.com
 * @date 2017-11-02 19:03:02
 */
public class TblResAttr  {
	
	//
	private Integer autoid;
	//
	private BigDecimal resid;
	//
	private String resname;
	//
	private BigDecimal domainid;
	//
	private BigDecimal groupid;
	//
	private BigDecimal proxyid;
	//
	private Double longitude;
	//
	private Double latitude;
	//
	private String polygon;
	//
	private BigDecimal geometytype;
	//
	private BigDecimal restype;
	//
	private BigDecimal ressubtype;
	//
	private BigDecimal panangle;
	//
	private BigDecimal tiltangle;
	//
	private String comments;
	//
	private String matrixcamid;
	//
	private BigDecimal resourcetype;
	//
	private String sipdeviceid;
	//
	private String parentsipid;
	//
	private String manufacturer;
	//
	private String model;
	//
	private String owner;
	//
	private String civilcode;
	//
	private String address;
	//
	private BigDecimal parental;
	//
	private String parentid;
	//
	private BigDecimal registerway;
	//
	private String certnum;
	//
	private BigDecimal certifiable;
	//
	private BigDecimal errcode;
	//
	private String endtime;
	//
	private BigDecimal secrecy;
	//
	private BigDecimal safetyway;
	//
	private String block;
	//
	private String sippassword;
	//
	private BigDecimal ifonline;
	//
	private String sipip;
	//
	private BigDecimal sipport;
	//
	private BigDecimal priorityprotocol;
	//
	private String devicetime;
	//
	private String record;
	//
	private String status;
	//
	private String encode;
	//
	private String firmware;


	private String name;
	private String deviceId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * 设置：
	 */
	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
	}
	/**
	 * 获取：
	 */
	public Integer getAutoid() {
		return autoid;
	}
	/**
	 * 设置：
	 */
	public void setResid(BigDecimal resid) {
		this.resid = resid;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getResid() {
		return resid;
	}
	/**
	 * 设置：
	 */
	public void setResname(String resname) {
		this.resname = resname;
	}
	/**
	 * 获取：
	 */
	public String getResname() {
		return resname;
	}
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
	public void setGroupid(BigDecimal groupid) {
		this.groupid = groupid;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getGroupid() {
		return groupid;
	}
	/**
	 * 设置：
	 */
	public void setProxyid(BigDecimal proxyid) {
		this.proxyid = proxyid;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getProxyid() {
		return proxyid;
	}
	/**
	 * 设置：
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * 设置：
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * 设置：
	 */
	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}
	/**
	 * 获取：
	 */
	public String getPolygon() {
		return polygon;
	}
	/**
	 * 设置：
	 */
	public void setGeometytype(BigDecimal geometytype) {
		this.geometytype = geometytype;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getGeometytype() {
		return geometytype;
	}
	/**
	 * 设置：
	 */
	public void setRestype(BigDecimal restype) {
		this.restype = restype;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getRestype() {
		return restype;
	}
	/**
	 * 设置：
	 */
	public void setRessubtype(BigDecimal ressubtype) {
		this.ressubtype = ressubtype;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getRessubtype() {
		return ressubtype;
	}
	/**
	 * 设置：
	 */
	public void setPanangle(BigDecimal panangle) {
		this.panangle = panangle;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getPanangle() {
		return panangle;
	}
	/**
	 * 设置：
	 */
	public void setTiltangle(BigDecimal tiltangle) {
		this.tiltangle = tiltangle;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getTiltangle() {
		return tiltangle;
	}
	/**
	 * 设置：
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * 获取：
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * 设置：
	 */
	public void setMatrixcamid(String matrixcamid) {
		this.matrixcamid = matrixcamid;
	}
	/**
	 * 获取：
	 */
	public String getMatrixcamid() {
		return matrixcamid;
	}
	/**
	 * 设置：
	 */
	public void setResourcetype(BigDecimal resourcetype) {
		this.resourcetype = resourcetype;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getResourcetype() {
		return resourcetype;
	}
	/**
	 * 设置：
	 */
	public void setSipdeviceid(String sipdeviceid) {
		this.sipdeviceid = sipdeviceid;
	}
	/**
	 * 获取：
	 */
	public String getSipdeviceid() {
		return sipdeviceid;
	}
	/**
	 * 设置：
	 */
	public void setParentsipid(String parentsipid) {
		this.parentsipid = parentsipid;
	}
	/**
	 * 获取：
	 */
	public String getParentsipid() {
		return parentsipid;
	}
	/**
	 * 设置：
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * 获取：
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * 设置：
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * 获取：
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 设置：
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * 获取：
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * 设置：
	 */
	public void setCivilcode(String civilcode) {
		this.civilcode = civilcode;
	}
	/**
	 * 获取：
	 */
	public String getCivilcode() {
		return civilcode;
	}
	/**
	 * 设置：
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：
	 */
	public void setParental(BigDecimal parental) {
		this.parental = parental;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getParental() {
		return parental;
	}
	/**
	 * 设置：
	 */
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	/**
	 * 获取：
	 */
	public String getParentid() {
		return parentid;
	}
	/**
	 * 设置：
	 */
	public void setRegisterway(BigDecimal registerway) {
		this.registerway = registerway;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getRegisterway() {
		return registerway;
	}
	/**
	 * 设置：
	 */
	public void setCertnum(String certnum) {
		this.certnum = certnum;
	}
	/**
	 * 获取：
	 */
	public String getCertnum() {
		return certnum;
	}
	/**
	 * 设置：
	 */
	public void setCertifiable(BigDecimal certifiable) {
		this.certifiable = certifiable;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getCertifiable() {
		return certifiable;
	}
	/**
	 * 设置：
	 */
	public void setErrcode(BigDecimal errcode) {
		this.errcode = errcode;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getErrcode() {
		return errcode;
	}
	/**
	 * 设置：
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	/**
	 * 获取：
	 */
	public String getEndtime() {
		return endtime;
	}
	/**
	 * 设置：
	 */
	public void setSecrecy(BigDecimal secrecy) {
		this.secrecy = secrecy;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getSecrecy() {
		return secrecy;
	}
	/**
	 * 设置：
	 */
	public void setSafetyway(BigDecimal safetyway) {
		this.safetyway = safetyway;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getSafetyway() {
		return safetyway;
	}
	/**
	 * 设置：
	 */
	public void setBlock(String block) {
		this.block = block;
	}
	/**
	 * 获取：
	 */
	public String getBlock() {
		return block;
	}
	/**
	 * 设置：
	 */
	public void setSippassword(String sippassword) {
		this.sippassword = sippassword;
	}
	/**
	 * 获取：
	 */
	public String getSippassword() {
		return sippassword;
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
	/**
	 * 设置：
	 */
	public void setSipip(String sipip) {
		this.sipip = sipip;
	}
	/**
	 * 获取：
	 */
	public String getSipip() {
		return sipip;
	}
	/**
	 * 设置：
	 */
	public void setSipport(BigDecimal sipport) {
		this.sipport = sipport;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getSipport() {
		return sipport;
	}
	/**
	 * 设置：
	 */
	public void setPriorityprotocol(BigDecimal priorityprotocol) {
		this.priorityprotocol = priorityprotocol;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getPriorityprotocol() {
		return priorityprotocol;
	}
	/**
	 * 设置：
	 */
	public void setDevicetime(String devicetime) {
		this.devicetime = devicetime;
	}
	/**
	 * 获取：
	 */
	public String getDevicetime() {
		return devicetime;
	}
	/**
	 * 设置：
	 */
	public void setRecord(String record) {
		this.record = record;
	}
	/**
	 * 获取：
	 */
	public String getRecord() {
		return record;
	}
	/**
	 * 设置：
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setEncode(String encode) {
		this.encode = encode;
	}
	/**
	 * 获取：
	 */
	public String getEncode() {
		return encode;
	}
	/**
	 * 设置：
	 */
	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}
	/**
	 * 获取：
	 */
	public String getFirmware() {
		return firmware;
	}
}
