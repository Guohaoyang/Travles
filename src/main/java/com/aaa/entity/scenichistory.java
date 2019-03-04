package com.aaa.entity;

import java.util.Date;

public class scenichistory {

	private Integer shid;
	private Integer uid;
	private Integer tid;
	private Date createtime;
	public Integer getShid() {
		return shid;
	}
	public void setShid(Integer shid) {
		this.shid = shid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "scenichistory [shid=" + shid + ", uid=" + uid + ", tid=" + tid
				+ ", createtime=" + createtime + "]";
	}
	public scenichistory(Integer shid, Integer uid, Integer tid, Date createtime) {
		super();
		this.shid = shid;
		this.uid = uid;
		this.tid = tid;
		this.createtime = createtime;
	}
	public scenichistory() {
		super();
	}
	
	
}
