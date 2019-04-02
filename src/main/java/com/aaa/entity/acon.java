package com.aaa.entity;

public class acon {

	private Integer xid;
	private String xname;
	private String xpic;
	private String xcon;
	private Integer days;
	private Integer tid;
	public Integer getXid() {
		return xid;
	}
	public void setXid(Integer xid) {
		this.xid = xid;
	}
	public String getXname() {
		return xname;
	}
	public void setXname(String xname) {
		this.xname = xname;
	}
	public String getXpic() {
		return xpic;
	}
	public void setXpic(String xpic) {
		this.xpic = xpic;
	}
	public String getXcon() {
		return xcon;
	}
	public void setXcon(String xcon) {
		this.xcon = xcon;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "acon [xid=" + xid + ", xname=" + xname + ", xpic=" + xpic
				+ ", xcon=" + xcon + ", days=" + days + ", tid=" + tid + "]";
	}
	public acon(Integer xid, String xname, String xpic, String xcon,
			Integer days, Integer tid) {
		super();
		this.xid = xid;
		this.xname = xname;
		this.xpic = xpic;
		this.xcon = xcon;
		this.days = days;
		this.tid = tid;
	}
	public acon() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
