package com.aaa.entity;

public class months {

	private Integer mid;
	private String mname;
	private Integer mstatus;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Integer getMstatus() {
		return mstatus;
	}
	public void setMstatus(Integer mstatus) {
		this.mstatus = mstatus;
	}
	@Override
	public String toString() {
		return "months [mid=" + mid + ", mname=" + mname + ", mstatus="
				+ mstatus + "]";
	}
	public months(Integer mid, String mname, Integer mstatus) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mstatus = mstatus;
	}
	public months() {
		super();
	}
	
	

}
