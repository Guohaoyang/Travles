package com.aaa.entity;

import java.util.Date;

public class comecomment {

	private Integer cid;
	private Integer csid;
	private Integer uid;
	private Date createtime;
	private Integer tstatus;
	private String cocontent;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getCsid() {
		return csid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
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
	
	public comecomment(Integer cid, Integer csid, Integer uid, Date createtime,
			Integer tstatus, String cocontent) {
		super();
		this.cid = cid;
		this.csid = csid;
		this.uid = uid;
		this.createtime = createtime;
		this.tstatus = tstatus;
		this.cocontent = cocontent;
	}
	@Override
	public String toString() {
		return "comecomment [cid=" + cid + ", csid=" + csid + ", uid=" + uid
				+ ", createtime=" + createtime + ", tstatus=" + tstatus
				+ ", cocontent=" + cocontent + "]";
	}
	public String getCocontent() {
		return cocontent;
	}
	public void setCocontent(String cocontent) {
		this.cocontent = cocontent;
	}
	public comecomment() {
		super();
	}

	
}
