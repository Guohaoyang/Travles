package com.aaa.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.entity.city;
import com.aaa.entity.comemessage;
import com.aaa.entity.tusers;
@Mapper
public interface ComemessageDao {
	public int add(comemessage c);
	public List<String> queryCity();
	public List<tusers> loginq(String uname,String upwd);
	public int addjieban(int uid,String title,int ccid,int cid,String createtime,String endtime,String text,int num,String url);
	public int querycityID(String name);
	public List<comemessage> queryqll();
	public List<comemessage> queryById(int id);
	//查询谁发布的的用户
	public tusers tuserByid(int uid);
	public int addapply(String acontent,int uid,int uuid);
}
