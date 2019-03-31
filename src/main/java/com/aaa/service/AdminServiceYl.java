package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.AdminDaoYl;
import com.aaa.entity.Pages;
import com.aaa.entity.city;
import com.aaa.entity.scenicspots;
import com.aaa.entity.tadmin;

@Service
public class AdminServiceYl {

	@Autowired
	AdminDaoYl yl;
	//后台管理员登录
	public tadmin loginAdmin(String tname,String tpwd){
		return yl.loginAdmin(tname, tpwd);
	}
	//根据ID查询管理员的基本信息
	public tadmin queryByTid(Integer tid){
		return yl.queryByTid(tid);
	}
	//修改管理员的信息
	public int updateAdminYl(tadmin admin){
		int rs = yl.updateAdminYl(admin);
		return rs;
	}
	//用户的数量
	public int UserNum(){
		int rs = yl.UserNum();
		return rs;
	}
	//景点的数量
	public int scenicspotsNum(){
		int rs = yl.scenicspotsNum();
		return rs;
	}
	//游记的数量
	public int travelnotesNum(){
		int rs = yl.travelnotesNum();
		return rs;
	}
	//攻略的数量
	public int strategyNum(){
		int rs = yl.strategyNum();
		return rs;
	}
	//结伴的数量
	public int comemessage(){
		int rs = yl.comemessage();
		return rs;
	}
	//查询所有景点的信息
	public List<Map<String,Object>> queryScenicspots(Pages page){
		return yl.queryScenicspots(page);
	}
	//后台查询所有的城市信息
	public List<city> queryCity(Pages page){
		return yl.queryCity(page);
	}
	//城市的数量
	public Integer cityNum() {
		int rs = yl.cityNum();
		return rs;
	}
}
