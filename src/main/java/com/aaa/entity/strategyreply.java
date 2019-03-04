package com.aaa.entity;

import java.util.Date;

public class strategyreply {

	private Integer srid;
	private Integer scid;
	private Integer uid;
	private String tcontent;
	private Date createtime;
	private Integer tstatus;
	public Integer getSrid() {
		return srid;
	}
	public void setSrid(Integer srid) {
		this.srid = srid;
	}
	public Integer getScid() {
		return scid;
	}
	public void setScid(Integer scid) {
		this.scid = scid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getTcontent() {
		return tcontent;
	}
	public void setTcontent(String tcontent) {
		this.tcontent = tcontent;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getTstatus() {
		return tstatus;
	}
	public void setTstatus(Integer tstatus) {
		this.tstatus = tstatus;
	}
	@Override
	public String toString() {
		return "strategyreply [srid=" + srid + ", scid=" + scid + ", uid="
				+ uid + ", tcontent=" + tcontent + ", createtime=" + createtime
				+ ", tstatus=" + tstatus + "]";
	}
	public strategyreply(Integer srid, Integer scid, Integer uid,
			String tcontent, Date createtime, Integer tstatus) {
		super();
		this.srid = srid;
		this.scid = scid;
		this.uid = uid;
		this.tcontent = tcontent;
		this.createtime = createtime;
		this.tstatus = tstatus;
	}
	public strategyreply() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
