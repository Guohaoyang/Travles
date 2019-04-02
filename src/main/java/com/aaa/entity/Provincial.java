package com.aaa.entity;

import java.io.Serializable;

public class Provincial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pid;
	private String pname;
	private String address;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Provincial(Integer pid, String pname, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
	}
	public Provincial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Provincial [pid=" + pid + ", pname=" + pname + ", address="
				+ address + "]";
	}

}
