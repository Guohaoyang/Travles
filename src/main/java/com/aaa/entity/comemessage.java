package com.aaa.entity;

import java.util.Date;

public class comemessage {

	private Integer csid;
	private String csname;
	private String cscontent;
	private Date createtime;
	private Date endtime;
	private Integer num;
	private Integer uid;
	private Integer cid;
	private Integer ccid;
	private Integer tstatus;
	public Integer getCsid() {
		return csid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public String getCscontent() {
		return cscontent;
	}
	public void setCscontent(String cscontent) {
		this.cscontent = cscontent;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
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
	public Integer getCcid() {
		return ccid;
	}
	public void setCcid(Integer ccid) {
		this.ccid = ccid;
	}
	public Integer getTstatus() {
		return tstatus;
	}
	public void setTstatus(Integer tstatus) {
		this.tstatus = tstatus;
	}
	@Override
	public String toString() {
		return "comemessage [csid=" + csid + ", csname=" + csname
				+ ", cscontent=" + cscontent + ", createtime=" + createtime
				+ ", endtime=" + endtime + ", num=" + num + ", uid=" + uid
				+ ", cid=" + cid + ", ccid=" + ccid + ", tstatus=" + tstatus
				+ "]";
	}
	public comemessage(Integer csid, String csname, String cscontent,
			Date createtime, Date endtime, Integer num, Integer uid,
			Integer cid, Integer ccid, Integer tstatus) {
		super();
		this.csid = csid;
		this.csname = csname;
		this.cscontent = cscontent;
		this.createtime = createtime;
		this.endtime = endtime;
		this.num = num;
		this.uid = uid;
		this.cid = cid;
		this.ccid = ccid;
		this.tstatus = tstatus;
	}
	public comemessage() {
		super();
	}

	
}
