package com.aaa.entity;

public class comeattention {
	
	private Integer caid;
	private Integer uid;
	private Integer uuid;
	private Integer csid;
	
	public Integer getCsid() {
		return csid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
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
	
	public comeattention(Integer caid, Integer uid, Integer uuid, Integer csid) {
		super();
		this.caid = caid;
		this.uid = uid;
		this.uuid = uuid;
		this.csid = csid;
	}
	@Override
	public String toString() {
		return "comeattention [caid=" + caid + ", uid=" + uid + ", uuid="
				+ uuid + ", csid=" + csid + "]";
	}
	public comeattention() {
		super();
	}

	
}
