package com.aaa.entity;

public class tadmin {

	private Integer tid;
	private String tname;
	private String tpwd;
	private String tpic;
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
	public String getTpwd() {
		return tpwd;
	}
	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}
	public String getTpic() {
		return tpic;
	}
	public void setTpic(String tpic) {
		this.tpic = tpic;
	}
	public Integer getTstatus() {
		return tstatus;
	}
	public void setTstatus(Integer tstatus) {
		this.tstatus = tstatus;
	}
	@Override
	public String toString() {
		return "tadmin [tid=" + tid + ", tname=" + tname + ", tpwd=" + tpwd
				+ ", tpic=" + tpic + ", tstatus=" + tstatus + "]";
	}
	public tadmin(Integer tid, String tname, String tpwd, String tpic,
			Integer tstatus) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tpwd = tpwd;
		this.tpic = tpic;
		this.tstatus = tstatus;
	}
	public tadmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
