package com.aaa.entity;

import java.util.Date;

public class continect {
	private Integer contid;
	private String contname;
	private String details;
	private Integer contstatus;
	public Integer getContid() {
		return contid;
	}
	public void setContid(Integer contid) {
		this.contid = contid;
	}
	public String getContname() {
		return contname;
	}
	public void setContname(String contname) {
		this.contname = contname;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Integer getContstatus() {
		return contstatus;
	}
	public void setContstatus(Integer contstatus) {
		this.contstatus = contstatus;
	}
	@Override
	public String toString() {
		return "continect [contid=" + contid + ", contname=" + contname
				+ ", details=" + details + ", contstatus=" + contstatus + "]";
	}
	public continect(Integer contid, String contname, String details,
			Integer contstatus) {
		super();
		this.contid = contid;
		this.contname = contname;
		this.details = details;
		this.contstatus = contstatus;
	}
	public continect() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
