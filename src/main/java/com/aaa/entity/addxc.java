package com.aaa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class addxc {

	private Integer tid;
	private String start;
	private String end;
	private Integer days;
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date startTime;
	private Integer uid;
	private String tname;
	private String picd;
	private String picf;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPicd() {
		return picd;
	}
	public void setPicd(String picd) {
		this.picd = picd;
	}
	public String getPicf() {
		return picf;
	}
	public void setPicf(String picf) {
		this.picf = picf;
	}
	@Override
	public String toString() {
		return "addxc [tid=" + tid + ", start=" + start + ", end=" + end
				+ ", days=" + days + ", startTime=" + startTime + ", uid="
				+ uid + ", tname=" + tname + ", picd=" + picd + ", picf="
				+ picf + "]";
	}
	public addxc(Integer tid, String start, String end, Integer days,
			Date startTime, Integer uid, String tname, String picd, String picf) {
		super();
		this.tid = tid;
		this.start = start;
		this.end = end;
		this.days = days;
		this.startTime = startTime;
		this.uid = uid;
		this.tname = tname;
		this.picd = picd;
		this.picf = picf;
	}
	public addxc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
