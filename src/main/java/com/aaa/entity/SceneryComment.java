package com.aaa.entity;

import java.io.Serializable;

public class SceneryComment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer scid;
	private Integer uid;
	private Integer ssid;
	private String upic;
	private String scomment;
	private String sdatetime;
	private String scpic;
	//多对一
	private tusers  users;
	
	public tusers getUsers() {
		return users;
	}
	public void setUsers(tusers users) {
		this.users = users;
	}
	public Integer getScid() {
		return scid;
	}
	public void setScid(Integer scid) {
		this.scid = scid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getSsid() {
		return ssid;
	}
	public void setSsid(Integer ssid) {
		this.ssid = ssid;
	}
	public String getUpic() {
		return upic;
	}
	public void setUpic(String upic) {
		this.upic = upic;
	}
	public String getScomment() {
		return scomment;
	}
	public void setScomment(String scomment) {
		this.scomment = scomment;
	}
	public String getSdatetime() {
		return sdatetime;
	}
	public void setSdatetime(String sdatetime) {
		this.sdatetime = sdatetime;
	}
	public String getScpic() {
		return scpic;
	}
	public void setScpic(String scpic) {
		this.scpic = scpic;
	}
	public SceneryComment(Integer scid, Integer uid, Integer ssid, String upic,
			String scomment, String sdatetime, String scpic) {
		super();
		this.scid = scid;
		this.uid = uid;
		this.ssid = ssid;
		this.upic = upic;
		this.scomment = scomment;
		this.sdatetime = sdatetime;
		this.scpic = scpic;
	}
	public SceneryComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SceneryComment [scid=" + scid + ", uid=" + uid + ", ssid="
				+ ssid + ", upic=" + upic + ", scomment=" + scomment
				+ ", sdatetime=" + sdatetime + ", scpic=" + scpic + "]";
	}
}
