package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.aaa.entity.tadmin;

@Mapper
public interface backDao {
	//管理员个人查询
	@Select("select * from tadmin where tid = #{param1}")
	public tadmin query(Integer tid);
	//查询所有管理员
	@Select("select * from tadmin")
	public List<tadmin> queryTadmin();
	//修改自己的信息（自己为管理员）
	@Update("update tadmin set tname=#{tname},tpwd=#{tpwd} where tid = #{tid}")
	public Integer editMyself(tadmin t);
	//删除管理员
	@Delete("delete from tadmin where tid = #{param1}")
	public Integer delAdmin(Integer tid);
	//添加一个管理员
	@Insert("insert into tadmin(tname,tpwd) values(#{tname},#{tpwd})")
	public Integer addAdmin(tadmin t);
}
