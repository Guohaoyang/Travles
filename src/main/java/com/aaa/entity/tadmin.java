package com.aaa.entity;

import java.io.Serializable;

public class tadmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer tid;
	private String tname;
	private String tpwd;
	private String tpic;
	private Integer tstatus;
	private String phone;
	private  String email;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public tadmin(Integer tid, String tname, String tpwd, String tpic,
			Integer tstatus, String phone, String email) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tpwd = tpwd;
		this.tpic = tpic;
		this.tstatus = tstatus;
		this.phone = phone;
		this.email = email;
	}
	public tadmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "tadmin [tid=" + tid + ", tname=" + tname + ", tpwd=" + tpwd
				+ ", tpic=" + tpic + ", tstatus=" + tstatus + ", phone="
				+ phone + ", email=" + email + "]";
	}
}
