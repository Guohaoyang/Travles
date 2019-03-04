package com.aaa.entity;

import java.util.Date;

public class travelnotesreply {

	private Integer replayid;
	private Integer traveid;
	private Integer uid;
	private String tcontent;
	private Date createtime;
	private Integer tstatus;
	public Integer getReplayid() {
		return replayid;
	}
	public void setReplayid(Integer replayid) {
		this.replayid = replayid;
	}
	public Integer getTraveid() {
		return traveid;
	}
	public void setTraveid(Integer traveid) {
		this.traveid = traveid;
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
		return "travelnotesreply [replayid=" + replayid + ", traveid="
				+ traveid + ", uid=" + uid + ", tcontent=" + tcontent
				+ ", createtime=" + createtime + ", tstatus=" + tstatus + "]";
	}
	public travelnotesreply() {
		super();
	}
	
	

}
