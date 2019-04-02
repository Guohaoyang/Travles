package com.aaa.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.entity.apply;
import com.aaa.entity.city;
import com.aaa.entity.comeattention;
import com.aaa.entity.comecomment;
import com.aaa.entity.comemessage;
import com.aaa.entity.comereply;
import com.aaa.entity.tusers;
@Mapper
public interface ComemessageDao {
	public int add(comemessage c);
	public List<String> queryCity();
	public List<tusers> loginq(String uname,String upwd);
	public int addjieban(int uid,String title,int ccid,int cid,String createtime,String endtime,String text,int num,String url);
	public int querycityID(String name);
	public List<comemessage> queryqll(Integer pageNum);
	public List<comemessage> queryById(int id);
	//查询谁发布的的用户
	public tusers tuserByid(int uid);
	public int addapply(String acontent,int uid,int uuid,int csid);
	//查询某结伴的旅行地信息
	public city cityPicById(int id);
	//查询全部旅行地信息
	public List<city> QueryCity();
	//查询是否有未读结伴消息
	public List<Map<Object,Object>> queryApplyNews(int id);
	//如果不同意结伴删除此结伴申请
	public void del(int id);
	public int addgx(int uid,int uuid,int csid);
	//查询某结伴评论和评论用户
	public List<Map<Object,Object>> queryComById(Integer id,Integer num);
	//查询某结伴评论数量
	public Integer queryPLCount(Integer id);
	//发表评论
	public int addpl(String content,Integer csid,Integer uid);
	public List<tusers> queryAllTuser();
	//回复某个评论 
	public Integer addhfpl(int csid,int uid,int uuid,String tcontent);
	//根据结伴ID查询回复信息
	public List<Map<Object,Object>> queryHf(Integer id ,Integer num);
	public Integer queryComemessageCount();
	public Integer Codejb(int uid,int uuid ,int csid);
	//成为结伴关系后增加我方人数
	public int UpaddNum(int id);
	//修改某条结伴信息的状态为已经结束
	public int UpComemessageTstate(int id);
	//根据登录用户查询结伴信息为2的结伴详情
	public List<Map<Object,Object>> queryJbxqByid(int id);
	//根据结伴信息id和登录id和发布id查询是否有结伴
	public int queryYesNoComemessageByid(int csid,int mapid,int fbid);
	//添加结伴关系人的评价
	public int addAppRaise(int uuid,int csid,String content);
	//查询某条结伴的结伴人评价
	public List<Map<Object,Object>> queryAppRaiseByid(int id);
	//查询某条结伴的结伴人评价回复
	public List<Map<Object,Object>> queryRating(int id);
	//添加评价回复
	public int addhfpj(int cid,int uid,int uuid,String content);
}
