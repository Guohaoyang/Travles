package com.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ComemessageDao;
import com.aaa.entity.apply;
import com.aaa.entity.city;
import com.aaa.entity.comeattention;
import com.aaa.entity.comecomment;
import com.aaa.entity.comemessage;
import com.aaa.entity.comereply;
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
	public List<comemessage> queryqll(Integer pageNum){
		return cd.queryqll(pageNum);
	}
	public List<comemessage> queryById(int id){
		return cd.queryById(id);
	}
	public tusers tuserByid(int uid){
		return cd.tuserByid(uid);
	}
	public int addapply(String acontent,int uid,int uuid,int csid){
		return cd.addapply(acontent, uid, uuid,csid);
	}
	public city cityPicById(int id){
		return cd.cityPicById(id);
	}
	public List<city> QueryCity(){
		return cd.QueryCity();
	}
	public List<Map<Object,Object>> queryApplyNews(int id){
		return cd.queryApplyNews(id);
	}
	public void del(int id){
		cd.del(id);
	}
	public int addgx(int uid,int uuid,int csid){
		return cd.addgx(uid, uuid,csid);
	}
	public List<Map<Object,Object>> queryComById(Integer id,Integer num){
		if(null==num){
			num=1;
		}
		Integer offset=(num-1)*2;
		//根据结伴ID查询本次结伴的所有评论
		List<Map<Object, Object>> comemessage = cd.queryComById(id,offset);
		//查询所有评论的回复信息
		List<Map<Object,Object>> hf = cd.queryHf(id,offset);
		for (int i = 0; i < comemessage.size(); i++) {
			Integer cid = (Integer) comemessage.get(i).get("cid");
			comemessage.get(i).put("hfList", null);
			List<Map<Object,Object>> hfList = null;
			hfList = new ArrayList<Map<Object,Object>>();
			for (int j = 0; j < hf.size(); j++) {
				Integer cid2 = (Integer) hf.get(j).get("cid");
				if(cid.equals(cid2)){
					hfList.add(hf.get(j));
				}
				//System.out.println(hfList);
			}
			comemessage.get(i).put("hfList", hfList);
			//System.out.println(comemessage.get(i));
		}
		//System.out.println("comemessage"+comemessage);
		return comemessage;
	}
	public int addpl(String content,Integer csid,Integer uid){
		return cd.addpl(content, csid, uid);
	}
	public List<tusers> queryAllTuser(){
		return cd.queryAllTuser();
	}
	public Integer queryPLCount(Integer id){
		return cd.queryPLCount(id);
	}
	public Integer addhfpl(int csid,int uid,int uuid,String tcontent){
		return cd.addhfpl(csid, uid, uuid, tcontent);
	}
	public Integer queryComemessageCount(){
		return cd.queryComemessageCount();	
	}
	public Integer Codejb(int uid,int uuid ,int csid){
		return cd.Codejb(uid, uuid,csid);
	}
	public int UpaddNum(int id){
		return cd.UpaddNum(id);
	}
	public int UpComemessageTstate(int id){
		return cd.UpComemessageTstate(id);
	}
	public List<Map<Object,Object>> queryJbxqByid(int id){
		return cd.queryJbxqByid(id);
	}
	public int queryYesNoComemessageByid(int csid,int mapid,int fbid){
		return cd.queryYesNoComemessageByid(csid, mapid, fbid);
	}
	public int addAppRaise(int uuid,int csid,String content){
		return cd.addAppRaise(uuid, csid, content);
	}
	public List<Map<Object,Object>> queryAppRaiseByid(int id){
		List<Map<Object, Object>> comemessage = cd.queryAppRaiseByid(id);
		//查询所有评价的回复信息
		List<Map<Object,Object>> hf = cd.queryRating(id);
		for (int i = 0; i < comemessage.size(); i++) {
			Integer cid = (Integer) comemessage.get(i).get("rid");
			comemessage.get(i).put("hfList", null);
			List<Map<Object,Object>> hfList = null;
			hfList = new ArrayList<Map<Object,Object>>();
			for (int j = 0; j < hf.size(); j++) {
				Integer cid2 = (Integer) hf.get(j).get("cid");
				if(cid.equals(cid2)){
					hfList.add(hf.get(j));
				}
				System.out.println(hfList);
			}
			comemessage.get(i).put("hfList", hfList);
			//System.out.println(comemessage.get(i));
		}
		System.out.println("comemessage"+comemessage);
		return comemessage;
	}
	public int addhfpj(int cid,int uid,int uuid,String content){
		return cd.addhfpj(cid, uid, uuid, content);
	}
}
