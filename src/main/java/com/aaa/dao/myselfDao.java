package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.aaa.entity.city;
import com.aaa.entity.scenicspots;
import com.aaa.entity.tusers;

@Mapper
public interface myselfDao {
	//查询自己的粉丝uid自己粉丝usid
	@Select("select * from tusers where uid in(select uid from attention where usid = #{param1})")
	public List<tusers> queryfans(Integer uid);
	//查询自己的关注自己usid  粉丝uid
	@Select("select * from tusers where uid in(select usid from attention where uid = #{param1})")
	public List<tusers> querydana(Integer uid);
	//查询自己发表的结伴信息
	//查询自己发表的游记
	//查询自己的个人信息
	@Select("select * from tusers where uid = #{param1}")
	public List<tusers> queryusers(Integer uid);
	//加关注
	@Insert("insert into attention(uid,usid) values(#{param1},#{param2})")
	public Integer addAttention(Integer uid,Integer usid);
	//取消关注
	@Delete("delete from attention where uid = #{param1} and usid = #{param2}")
	public Integer delAttention(Integer uid,Integer usid);
	
	//主页查询
	//查询三个城市
	@Select("select * from city where cid in(6,7,10) order by cid desc")
	public List<city> querycity();
	//查询四个景点
	@Select("select * from scenicspots order by ssid desc limit 1,4")
	public List<scenicspots> queryscenicspots();
}
