package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.aaa.entity.tadmin;

@Mapper
public interface backDao {
	//管理员个人查询
	@Select("select * from tadmin where tid = #{param1}")
	public tadmin query(Integer tid);
}
