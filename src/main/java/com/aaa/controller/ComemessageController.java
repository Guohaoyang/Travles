package com.aaa.controller;


import java.io.File;
import java.io.IOException;


import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.entity.apply;
import com.aaa.entity.city;
import com.aaa.entity.comemessage;
import com.aaa.entity.tusers;
import com.aaa.service.ComemessageService;
import com.aaa.service.FilePathService;

@Controller
@RequestMapping("backf")
public class ComemessageController  {
	@Resource
	ComemessageService cs;
	@Autowired
	FilePathService fs;
	//返回登录页面
	@RequestMapping("login")
	public String userLogin(){
	        return "loginq.html";
	}
	@RequestMapping("login-error")
	public String loginError(){	
	        return "cs/login-error.html";
	}
	@RequestMapping("aa")
	public String logina(){	
	        return "cs/aa.html";
	}
	//上传图片到本地
	@RequestMapping("sc")
	@ResponseBody
	public String sc(MultipartFile photo,HttpServletRequest req,HttpSession s){
		System.out.println("contriller: "+fs.Upload(photo));
		try {
			String url=fs.Upload(photo);
			System.out.println("controller:"+url);
			s.setAttribute("scurl", url);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "a";
		}
	}
	//查询所有结伴信息
	@RequestMapping("query")
	public ModelAndView test(ModelAndView m,HttpSession s){
		tusers map =  (tusers) s.getAttribute("loginqlist");
		System.out.println(map);
		//s.setAttribute("userlist", map);
		m.setViewName("fabujieban.html");
		m.addObject("list", map);
		return m;
	}
	//结伴主页面
	@RequestMapping("cs")
	public ModelAndView aaa(Integer pageNum, ModelAndView m,HttpSession s){
		//查看所有结伴信息
		if(null==pageNum) pageNum=1;
		Integer offset=(pageNum-1)*8;
		List<comemessage> list=cs.queryqll(offset);
		Date mydate=new Date();
		//System.out.println("当前时间："+mydate);
		//判断某个结伴信息是否已过结伴结束时间 如果某条已过结束时间则修改状态为2 为结束状态
		for (int i = 0; i < list.size(); i++) {
			//System.out.println("."+list.get(i).getEndtime());
			Date o=list.get(i).getEndtime();
			//System.out.println("aa"+o);
			if(o.before(mydate)){
				 //System.out.println(list.get(i).getCsid()+".."+o + "在" + mydate + "前面");
				 if(list.get(i).getTstatus()!=2){
					 cs.UpComemessageTstate(list.get(i).getCsid());
					 System.out.println("修改一次状态！");
				 }
			}else if(o.after(mydate)){
				//System.out.println(list.get(i).getCsid()+".."+o + "在" + mydate + "后面");
			}else{
				//System.out.println(list.get(i).getCsid()+".."+"相等");
			}
		}
		//所登录的用户信息
		tusers map =  (tusers) s.getAttribute("loginqlist");
		//System.out.println(map);
		//System.out.println(list);
		List<city> city=cs.QueryCity();
		m.addObject("city", city);
		//System.out.println(city);
		m.addObject("list", map);
		//System.out.println("map"+map);
		m.setViewName("zz.html");
		m.addObject("jblist", list);
		Integer num=cs.queryComemessageCount();
		m.addObject("num", num);
		m.addObject("pageNum", pageNum);
		//查询是否有未读结伴消息
		if(map!=null){
			List<Map<Object,Object>> xx=cs.queryApplyNews(map.getUid());
			if(xx.size()>0){
				m.addObject("xx", xx);
				System.out.println(xx);
			}
			List<Map<Object,Object>>pj=cs.queryJbxqByid(map.getUid());
			if(pj.size()>0){
				m.addObject("pj", pj);
				System.out.println("未pjid"+pj);
			}
		}
		return m;
	}
	//某个结伴详情
	@RequestMapping("jbxq")
	public ModelAndView aaaa(int id,Integer pageNum,ModelAndView m,HttpSession s){
		//根据选中的结伴获得此结伴所有数据
		List<comemessage> list=cs.queryById(id);
		//System.out.println(list);
		//登录用户数据
		tusers map =  (tusers) s.getAttribute("loginqlist");
		//System.out.println(map);
		m.setViewName("jbxq.html");
		//System.out.println(list.get(0).getUid());
		//根据结伴详情id查询谁发布的用户数据
		tusers fabuyonghu=cs.tuserByid(list.get(0).getUid());
		//System.out.println(fabuyonghu);
		////查询某结伴的旅行地信息
		//System.out.println("旅行地Id"+list.get(0).getCcid());
		city city=cs.cityPicById((Integer)list.get(0).getCcid());
		//System.out.println("旅行地信息:"+city);
		m.addObject("city", city);
		m.addObject("fabuyonghu", fabuyonghu);
		m.addObject("list", map);
		System.out.println("aaaaaaaaaaa"+map);
		m.addObject("jbxqlist", list);
		Integer num=cs.queryPLCount(id);
		m.addObject("num", num);
		List<Map<Object,Object>> pl=cs.queryComById(id,pageNum);
		m.addObject("pageNum", pageNum);
		//System.out.println(pl);
		//System.out.println("aaaaa"+pl.get(0).get("hfList"));
		m.addObject("pllist",pl);
		m.addObject("id",1);
		//结伴人的评价回复
		List<Map<Object,Object>> raise=cs.queryAppRaiseByid(id);
		System.out.println("评价："+raise);
		m.addObject("raise", raise);
		//System.out.println("aaaaa"+raise.get(0).get("hfList"));
		return m;
	}
	@RequestMapping("jloginq")
	public String aaaa(){
		return "loginq.html";
	}
	@RequestMapping("add")
	@ResponseBody
	public String add(MultipartFile photo,HttpServletRequest req,HttpSession s){
		String origname=photo.getOriginalFilename();
		String url="";
		//System.out.println(origname);
		if(null!=origname){
			System.out.println("进来了");
			//System.out.println(photo.getOriginalFilename());
			String realPath=req.getServletContext().getRealPath("song");
			String filename=realPath+ "/"+origname;
			//System.out.println(filename);
			 url=filename;
			File newFile=new File(filename);
			try {
				photo.transferTo(newFile);
				System.out.println("url:"+url);
				url=url.substring(url.lastIndexOf("\\s"));
				System.out.println("截取后："+url);
				s.setAttribute("url1", url);
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "success";
	}
	@RequestMapping("queryByCity")
	@ResponseBody
	public List<String> queryCity(){
		List<String> lists=cs.queryCity();
		System.out.println(lists);
		return lists;
	}
	@RequestMapping("loginq")
	@ResponseBody
	public int login(String uname,String upwd,ModelAndView m,HttpSession s){
		List<tusers> list=cs.loginq(uname, upwd);
		if(list.size()<0){
			System.out.println("登录失败");
			return 2;
		}else{
			System.out.println("登录成功 ");
			s.setAttribute("loginqlist",list.get(0));
			System.out.println(list);
			return 1;
		}
	}
	//发布结伴
	//{'uid':a,'title':a1,'ccid':a2,'cid':a3,'createtime':a5,'endtime':a4,'text':a6},
	@RequestMapping("addjieban")
	@ResponseBody
	public int addjieban(HttpSession s,int uid,String title,String ccid,String cid,String createtime,String endtime,String text,int num,String url){
		System.out.println(uid);
		url=(String) s.getAttribute("scurl");
		System.out.println(url);
		int mudidi=cs.querycityID(ccid);
		int chufadi=cs.querycityID(cid);
		try {
			int rs=cs.addjieban(uid, title, mudidi, chufadi, createtime, endtime, text, num, url);
			System.out.println("rs: "+rs);
			return rs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	//发送申请结伴
	@RequestMapping("addapply")
	@ResponseBody
	public int addapplu(String acontent,int uid,int uuid,int csid){
		int code=cs.Codejb(uid, uuid ,csid);
		if(code<1){
			try {
				int rs=cs.addapply(acontent, uid, uuid, csid);
				int rss=cs.UpaddNum(csid);
				//System.out.println("增加人数：rs"+rss);
				return rs;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
		}else{
			return 3;
		}
	}
/*	@RequestMapping("ccc")
	@ResponseBody
	public void add() throws UnirestException{
		HttpResponse<String> response = Unirest.get("http://apis.haoservice.com/lifeservice/travel/HotelList?cityid=37&page=1&key=6bddf90ddbef40188600c2bcce9b32f9")
				  .asString();
		System.out.println(response.getBody());
	}*/
	@RequestMapping("NoOr")
	@ResponseBody
	public int noor(int id){
		cs.del(id);
		return 1;
	}
	@RequestMapping("OrYes")
	@ResponseBody
	public int OrYes(int id,int uid,int uuid,int csid){
		int rs=cs.addgx(uid, uuid,csid);
		cs.del(id);
		return rs;
	}
	@RequestMapping("addpl")
	@ResponseBody
	public int addpl(String content,Integer csid,Integer uid){
		if(!content.equals("")){
			int rs=cs.addpl(content, csid, uid);
			System.out.println("rs"+rs);
			return rs;
		}else{
			return 3;
		}
	}
	@RequestMapping("addhfpl")
	@ResponseBody
	public int addhfpl(int csid,int uid,int uuid,String tcontent){
			int rs=cs.addhfpl(csid, uid, uuid, tcontent);
			System.out.println("addrs:"+rs);
			return rs;
	}
	@RequestMapping("queryJb")
	@ResponseBody
	public int queryJbl(int uid,int uuid,int csid){
			int rs=cs.queryYesNoComemessageByid(csid, uid, uuid);
			System.out.println("queryJbrs:"+rs);
			return rs;
	}
	@RequestMapping("addpj")
	@ResponseBody
	public int addpj(int uuid,int csid,String content){
		if(!content.equals("")){	
			int rs=cs.addAppRaise(uuid, csid, content);
			System.out.println("addjbrs:"+rs);
			return rs;
		}else{
			return 3;
		}
	}
	@RequestMapping("addpjhf")
	@ResponseBody
	public int addpjhf(int cid,int uid,int uuid,String content){
		if(!content.equals("")){	
			int rs=cs.addhfpj(cid, uid, uuid, content);
			System.out.println("addpjhfrs:"+rs);
			return rs;
		}else{
			return 3;
		}
			
	}
}
