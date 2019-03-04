package com.aaa.entity;

import java.util.Date;

public class travelnotes {

	private Integer tid;
	private String tname;
	private String tcontent;
	private Date createtime;
	private Integer uid;
	private Integer ttid;
	private Integer tstatus;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
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
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getTtid() {
		return ttid;
	}
	public void setTtid(Integer ttid) {
		this.ttid = ttid;
	}
	public Integer getTstatus() {
		return tstatus;
	}
	public void setTstatus(Integer tstatus) {
		this.tstatus = tstatus;
	}
	@Override
	public String toString() {
		return "travelnotes [tid=" + tid + ", tname=" + tname + ", tcontent="
				+ tcontent + ", createtime=" + createtime + ", uid=" + uid
				+ ", ttid=" + ttid + ", tstatus=" + tstatus + "]";
	}
	public travelnotes(Integer tid, String tname, String tcontent,
			Date createtime, Integer uid, Integer ttid, Integer tstatus) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tcontent = tcontent;
		this.createtime = createtime;
		this.uid = uid;
		this.ttid = ttid;
		this.tstatus = tstatus;
	}
	public travelnotes() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
