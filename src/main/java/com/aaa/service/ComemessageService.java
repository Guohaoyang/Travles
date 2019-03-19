package com.aaa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ComemessageDao;
import com.aaa.entity.city;
import com.aaa.entity.comemessage;
import com.aaa.entity.tusers;

@Service
public class ComemessageService {
	@Resource
	ComemessageDao cd;
	public int add(comemessage c){
		return cd.add(c);
	}
	public List<String> queryCity(){
		return cd.queryCity();
	}
	public List<tusers> loginq(String uname,String upwd){
		return cd.loginq(uname, upwd);
	}
	public int addjieban(int uid,String title,int ccid,int cid,String createtime,String endtime,String text,int num,String url){
		return cd.addjieban(uid, title, ccid, cid, createtime, endtime, text,num,url);
	}
	public int querycityID(String name){
		return cd.querycityID(name);
	}
	public List<comemessage> queryqll(){
		return cd.queryqll();
	}
	public List<comemessage> queryById(int id){
		return cd.queryById(id);
	}
	public tusers tuserByid(int uid){
		return cd.tuserByid(uid);
	}
	public int addapply(String acontent,int uid,int uuid){
		return cd.addapply(acontent, uid, uuid);
	}
}
