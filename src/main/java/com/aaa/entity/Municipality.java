package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

//自治区
public class Municipality implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer mpid;
	private String mpname;
	private String address;
	private Date createTime;
	public Integer getMpid() {
		return mpid;
	}
	public void setMpid(Integer mpid) {
		this.mpid = mpid;
	}
	public String getMpname() {
		return mpname;
	}
	public void setMpname(String mpname) {
		this.mpname = mpname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Municipality(Integer mpid, String mpname, String address,
			Date createTime) {
		super();
		this.mpid = mpid;
		this.mpname = mpname;
		this.address = address;
		this.createTime = createTime;
	}
	public Municipality() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Municipality [mpid=" + mpid + ", mpname=" + mpname
				+ ", address=" + address + ", createTime=" + createTime + "]";
	}
}
