package com.aaa.entity;

public class city {

	private Integer cid;
	private String cname;
	private Integer contryid;
	private String details;
	private Integer cstatus;
	private String citypic;	
	private String english;
	private String locationj;
	private String locationw;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getContryid() {
		return contryid;
	}
	public void setContryid(Integer contryid) {
		this.contryid = contryid;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Integer getCstatus() {
		return cstatus;
	}
	public void setCstatus(Integer cstatus) {
		this.cstatus = cstatus;
	}
	public String getCitypic() {
		return citypic;
	}
	public void setCitypic(String citypic) {
		this.citypic = citypic;
	}
	public String getEnglist() {
		return english;
	}
	public void setEnglist(String english) {
		this.english = english;
	}
	public String getLocationj() {
		return locationj;
	}
	public void setLocationj(String locationj) {
		this.locationj = locationj;
	}
	public String getLocationw() {
		return locationw;
	}
	public void setLocationw(String locationw) {
		this.locationw = locationw;
	}
	@Override
	public String toString() {
		return "city [cid=" + cid + ", cname=" + cname + ", contryid="
				+ contryid + ", details=" + details + ", cstatus=" + cstatus
				+ ", citypic=" + citypic + ", english=" + english
				+ ", locationj=" + locationj + ", locationw=" + locationw + "]";
	}
	public city(Integer cid, String cname, Integer contryid, String details,
			Integer cstatus, String citypic, String english, String locationj,
			String locationw) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.contryid = contryid;
		this.details = details;
		this.cstatus = cstatus;
		this.citypic = citypic;
		this.english = english;
		this.locationj = locationj;
		this.locationw = locationw;
	}
	public city() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
