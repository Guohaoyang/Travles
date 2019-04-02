package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

public class District implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer did;
	private String dname;
	private String address;
	
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public District(Integer did, String dname, String address) {
		super();
		this.did = did;
		this.dname = dname;
		this.address = address;
	}
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "District [did=" + did + ", dname=" + dname + ", address="
				+ address + "]";
	}
}
