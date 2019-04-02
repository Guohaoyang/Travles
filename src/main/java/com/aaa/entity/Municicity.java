package com.aaa.entity;

import java.io.Serializable;
//直辖市
public class Municicity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer mcid;
	private String mcname;
	private String address;
	public Integer getMcid() {
		return mcid;
	}
	public void setMcid(Integer mcid) {
		this.mcid = mcid;
	}
	public String getMcname() {
		return mcname;
	}
	public void setMcname(String mcname) {
		this.mcname = mcname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Municicity(Integer mcid, String mcname, String address) {
		super();
		this.mcid = mcid;
		this.mcname = mcname;
		this.address = address;
	}
	public Municicity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Municicity [mcid=" + mcid + ", mcname=" + mcname + ", address="
				+ address + "]";
	}
}
