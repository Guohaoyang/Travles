package com.aaa.entity;

public class apply {

	private Integer aid;
	private String acontent;
	private Integer uid;
	private Integer uuid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAcontent() {
		return acontent;
	}
	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	@Override
	public String toString() {
		return "apply [aid=" + aid + ", acontent=" + acontent + ", uid=" + uid
				+ ", uuid=" + uuid + "]";
	}
	public apply(Integer aid, String acontent, Integer uid, Integer uuid) {
		super();
		this.aid = aid;
		this.acontent = acontent;
		this.uid = uid;
		this.uuid = uuid;
	}
	public apply() {
		super();
	}

	
}
