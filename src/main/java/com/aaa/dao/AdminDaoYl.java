package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.aaa.entity.Pages;
import com.aaa.entity.city;
import com.aaa.entity.tadmin;
@Mapper
public interface AdminDaoYl {

	//登录
	@Select("select * from tadmin where tname = #{tname} and tpwd = #{tpwd}")
	public tadmin loginAdmin(@Param("tname") String tname,@Param("tpwd") String tpwd);
	
	@Select("select * from tadmin where tid = #{tid}")
	public tadmin queryByTid(Integer tid);
	
	@Update("update tadmin set tname = #{tname},tpwd = #{tpwd},"
			+ "tpic = #{tpic},phone =#{phone}, email =#{email} where tid =#{tid}")
	public int updateAdminYl(tadmin admin);
	
	@Select("select count(uid) from tusers")
	public int UserNum();
	
	@Select("select count(ssid) from  scenicspots")
	public int scenicspotsNum();
	
	@Select("select count(tid) from travelnotes")
	public int travelnotesNum();
	
	@Select("select count(stid)  from strategy")
	public int strategyNum();
	
	@Select("select count(csid) from comemessage")
	public int comemessage();
	
	@Select("select count(cid) from city")
	public int cityNum();
	
	@Select("select s.ssid,s.ssname,s.localurl,s.phone,c.cname,"
			+ "t.tname,m.mname,s.scstatus,s.scenicspotspic from  "
			+ "scenicspots s left join city c on s.cid = c.cid "
			+ "left join theme t on s.themeid = t.tid left join"
			+ " months m on s.monthsid = m.mid limit #{pageIndex},6 ")
	public List<Map<String,Object>> queryScenicspots(Pages page);
	
	@Select("select * from city limit  #{pageIndex},8")
	public List<city> queryCity(Pages page);
}
