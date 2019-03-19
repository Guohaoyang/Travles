package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.aaa.entity.city;
import com.aaa.entity.tadmin;
@Mapper
public interface TadminDao {
	public List<tadmin> login(String tname,String pwd);
	public List<city> queryCity();
	public tadmin queryByName(String name);
}
