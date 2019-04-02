package com.aaa.entity;

public class tusers {

	private Integer uid;
	private String uname;
	private String upwd;
	private String qq;
	private String tchat;
	private String idcard;
	private String details;
	private String phone;
	private String upic;
	private Integer tstatus;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getTchat() {
		return tchat;
	}
	public void setTchat(String tchat) {
		this.tchat = tchat;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUpic() {
		return upic;
	}
	public void setUpic(String upic) {
		this.upic = upic;
	}
	public Integer getTstatus() {
		return tstatus;
	}
	public void setTstatus(Integer tstatus) {
		this.tstatus = tstatus;
	}
	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "tusers [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ ", qq=" + qq + ", tchat=" + tchat + ", idcard=" + idcard
				+ ", phone=" + phone + ", upic=" + upic + ", tstatus="
				+ tstatus + "]";
	}
	public tusers(Integer uid, String uname, String upwd, String qq,
			String tchat, String idcard, String phone, String upic,
			Integer tstatus) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.qq = qq;
		this.tchat = tchat;
		this.idcard = idcard;
		this.phone = phone;
		this.upic = upic;
		this.tstatus = tstatus;
	}
	public tusers() {
		super();
	}
	
	

}
