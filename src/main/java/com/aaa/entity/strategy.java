package com.aaa.entity;

import java.util.Date;

public class strategy {

	private Integer stid;
	private String stname;
	private String stcontent;
	private Date createtime;
	private Integer uid;
	private Integer cid;
	private Integer tstatus;
	
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getStcontent() {
		return stcontent;
	}
	public void setStcontent(String stcontent) {
		this.stcontent = stcontent;
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
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getTstatus() {
		return tstatus;
	}
	public void setTstatus(Integer tstatus) {
		this.tstatus = tstatus;
	}
	@Override
	public String toString() {
		return "strategy [stid=" + stid + ", stname=" + stname + ", stcontent="
				+ stcontent + ", createtime=" + createtime + ", uid=" + uid
				+ ", cid=" + cid + ", tstatus=" + tstatus + "]";
	}
	public strategy(Integer stid, String stname, String stcontent,
			Date createtime, Integer uid, Integer cid, Integer tstatus) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.stcontent = stcontent;
		this.createtime = createtime;
		this.uid = uid;
		this.cid = cid;
		this.tstatus = tstatus;
	}
	public strategy() {
		super();
	}

	
}
