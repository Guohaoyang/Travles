package com.aaa.entity;

public class travelnoteshistory {

	private Integer thid;
	private Integer tid;
	private Integer uid;
	public Integer getThid() {
		return thid;
	}
	public void setThid(Integer thid) {
		this.thid = thid;
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
	@Override
	public String toString() {
		return "travelnoteshistory [thid=" + thid + ", tid=" + tid + ", uid="
				+ uid + "]";
	}
	public travelnoteshistory() {
		super();
	}
	
	

}
