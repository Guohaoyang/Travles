package com.aaa.entity;

public class attention {

	private Integer aid;
	private Integer uid;
	private Integer usid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	@Override
	public String toString() {
		return "attention [aid=" + aid + ", uid=" + uid + ", usid=" + usid
				+ "]";
	}
	public attention(Integer aid, Integer uid, Integer usid) {
		super();
		this.aid = aid;
		this.uid = uid;
		this.usid = usid;
	}
	public attention() {
		super();
	}

	
}
