package com.aaa.entity;

public class country {

	private Integer cid;
	private String cname;
	private Integer contid;
	private String details;
	private Integer cstatus;
	private String countrypic;
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
	public Integer getContid() {
		return contid;
	}
	public void setContid(Integer contid) {
		this.contid = contid;
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
	public String getCountrypic() {
		return countrypic;
	}
	public void setCountrypic(String countrypic) {
		this.countrypic = countrypic;
	}
	@Override
	public String toString() {
		return "country [cid=" + cid + ", cname=" + cname + ", contid="
				+ contid + ", details=" + details + ", cstatus=" + cstatus
				+ ", countrypic=" + countrypic + "]";
	}
	public country(Integer cid, String cname, Integer contid, String details,
			Integer cstatus, String countrypic) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.contid = contid;
		this.details = details;
		this.cstatus = cstatus;
		this.countrypic = countrypic;
	}
	public country() {
		super();
	}
	
	

}
