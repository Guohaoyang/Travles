package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.aaa.entity.tusers;

@Mapper
public interface TusersDao {

	//登录
	@Select("select * from tusers where phone=#{param1} and upwd= #{param2}")
	public List<tusers> login(String phone,String upwd);
	
	//注册
	@Insert("insert into tusers(phone,upwd,tstatus,upic,uname,details) VALUES(#{phone},#{upwd},1,'../static/myselfimg/20190321110244.jpg','users','请填写一段个人简介，长度可达200个字，简介将显示在你的个人页上。')")
	public Integer Register(tusers user);
	
	//查账号是否存在
	@Select("select * from  tusers where phone=#{param1}")
	public List<tusers>  Pexist(String phone);
}
