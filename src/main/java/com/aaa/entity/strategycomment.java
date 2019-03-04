package com.aaa.entity;

import java.util.Date;

public class strategycomment {

	private Integer scid;
	private Integer stid;
	private Integer uid;
	private String tcontent;
	private Date createtime;
	private Integer tstatus;
	public Integer getScid() {
		return scid;
	}
	public void setScid(Integer scid) {
		this.scid = scid;
	}
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
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
		return "strategycomment [scid=" + scid + ", stid=" + stid + ", uid="
				+ uid + ", tcontent=" + tcontent + ", createtime=" + createtime
				+ ", tstatus=" + tstatus + "]";
	}
	public strategycomment(Integer scid, Integer stid, Integer uid,
			String tcontent, Date createtime, Integer tstatus) {
		super();
		this.scid = scid;
		this.stid = stid;
		this.uid = uid;
		this.tcontent = tcontent;
		this.createtime = createtime;
		this.tstatus = tstatus;
	}
	public strategycomment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
