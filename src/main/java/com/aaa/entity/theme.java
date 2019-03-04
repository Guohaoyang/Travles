package com.aaa.entity;

public class theme {

	private Integer tid;
	private String tname;
	private Integer tstatus;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTstatus() {
		return tstatus;
	}
	public void setTstatus(Integer tstatus) {
		this.tstatus = tstatus;
	}
	@Override
	public String toString() {
		return "theme [tid=" + tid + ", tname=" + tname + ", tstatus="
				+ tstatus + "]";
	}
	public theme(Integer tid, String tname, Integer tstatus) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tstatus = tstatus;
	}
	public theme() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
