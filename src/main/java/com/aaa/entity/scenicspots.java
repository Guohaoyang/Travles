package com.aaa.entity;

import java.io.Serializable;

public class scenicspots implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ssid;
	private String ssname;
	private String localurl;
	private String phone;
	private String details;
	private Integer cid;
	private Integer themeid;
	private Integer monthsid;
	private Integer scstatus;
	private String scenicspotspic;
	public Integer getSsid() {
		return ssid;
	}
	public void setSsid(Integer ssid) {
		this.ssid = ssid;
	}
	public String getSsname() {
		return ssname;
	}
	public void setSsname(String ssname) {
		this.ssname = ssname;
	}
	public String getLocalurl() {
		return localurl;
	}
	public void setLocalurl(String localurl) {
		this.localurl = localurl;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getThemeid() {
		return themeid;
	}
	public void setThemeid(Integer themeid) {
		this.themeid = themeid;
	}
	public Integer getMonthsid() {
		return monthsid;
	}
	public void setMonthsid(Integer monthsid) {
		this.monthsid = monthsid;
	}
	public Integer getScstatus() {
		return scstatus;
	}
	public void setScstatus(Integer scstatus) {
		this.scstatus = scstatus;
	}
	public String getScenicspotspic() {
		return scenicspotspic;
	}
	public void setScenicspotspic(String scenicspotspic) {
		this.scenicspotspic = scenicspotspic;
	}
	@Override
	public String toString() {
		return "scenicspots [ssid=" + ssid + ", ssname=" + ssname
				+ ", localurl=" + localurl + ", phone=" + phone + ", details="
				+ details + ", cid=" + cid + ", themeid=" + themeid
				+ ", monthsid=" + monthsid + ", scstatus=" + scstatus
				+ ", scenicspotspic=" + scenicspotspic + "]";
	}
	public scenicspots(Integer ssid, String ssname, String localurl,
			String phone, String details, Integer cid, Integer themeid,
			Integer monthsid, Integer scstatus, String scenicspotspic) {
		super();
		this.ssid = ssid;
		this.ssname = ssname;
		this.localurl = localurl;
		this.phone = phone;
		this.details = details;
		this.cid = cid;
		this.themeid = themeid;
		this.monthsid = monthsid;
		this.scstatus = scstatus;
		this.scenicspotspic = scenicspotspic;
	}
	public scenicspots() {
		super();
	}
	
	

}
