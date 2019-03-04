package com.aaa.entity;

import java.util.Date;

public class continect {

	private Integer replayid;
	private Integer cid;
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
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
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
		return "continect [replayid=" + replayid + ", cid=" + cid + ", uid="
				+ uid + ", tcontent=" + tcontent + ", createtime=" + createtime
				+ ", tstatus=" + tstatus + "]";
	}
	public continect(Integer replayid, Integer cid, Integer uid,
			String tcontent, Date createtime, Integer tstatus) {
		super();
		this.replayid = replayid;
		this.cid = cid;
		this.uid = uid;
		this.tcontent = tcontent;
		this.createtime = createtime;
		this.tstatus = tstatus;
	}
	public continect() {
		super();
	}
	
	

}
