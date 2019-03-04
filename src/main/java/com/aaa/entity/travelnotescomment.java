package com.aaa.entity;

import java.util.Date;

public class travelnotescomment {

	private Integer traveid;
	private Integer tid;
	private Integer uid;
	private String tcontent;
	private Date createtime;
	private Integer tstatus;
	public Integer getTraveid() {
		return traveid;
	}
	public void setTraveid(Integer traveid) {
		this.traveid = traveid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
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
		return "travelnotescomment [traveid=" + traveid + ", tid=" + tid
				+ ", uid=" + uid + ", tcontent=" + tcontent + ", createtime="
				+ createtime + ", tstatus=" + tstatus + "]";
	}
	public travelnotescomment(Integer traveid, Integer tid, Integer uid,
			String tcontent, Date createtime, Integer tstatus) {
		super();
		this.traveid = traveid;
		this.tid = tid;
		this.uid = uid;
		this.tcontent = tcontent;
		this.createtime = createtime;
		this.tstatus = tstatus;
	}
	public travelnotescomment() {
		super();
	}

	
}
