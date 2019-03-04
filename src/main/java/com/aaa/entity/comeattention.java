package com.aaa.entity;

public class comeattention {
	
	private Integer caid;
	private Integer uid;
	private Integer uuid;
	public Integer getCaid() {
		return caid;
	}
	public void setCaid(Integer caid) {
		this.caid = caid;
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
		return "comeattention [caid=" + caid + ", uid=" + uid + ", uuid="
				+ uuid + "]";
	}
	public comeattention(Integer caid, Integer uid, Integer uuid) {
		super();
		this.caid = caid;
		this.uid = uid;
		this.uuid = uuid;
	}
	public comeattention() {
		super();
	}

	
}
