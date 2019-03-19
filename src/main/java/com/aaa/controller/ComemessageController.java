package com.aaa.controller;


import java.io.File;
import java.io.IOException;


import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;





import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

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
	public ModelAndView aaa(ModelAndView m,HttpSession s){
		//查看所有结伴信息
		List<comemessage> list=cs.queryqll();
		//所登录的用户信息
		tusers map =  (tusers) s.getAttribute("loginqlist");
		//System.out.println(map);
		//System.out.println(list);
		m.addObject("list", map);
		m.setViewName("zz.html");
		m.addObject("jblist", list);
		return m;
	}
	//某个结伴详情
	@RequestMapping("jbxq")
	public ModelAndView aaaa(int id,ModelAndView m,HttpSession s){
		//根据选中的结伴获得此结伴所有数据
		List<comemessage> list=cs.queryById(id);
		System.out.println(list);
		//登录用户数据
		tusers map =  (tusers) s.getAttribute("loginqlist");
		//System.out.println(map);
		m.setViewName("jbxq.html");
		System.out.println(list.get(0).getUid());
		//根据结伴详情id查询谁发布的用户数据
		tusers fabuyonghu=cs.tuserByid(list.get(0).getUid());
		System.out.println(fabuyonghu);
		m.addObject("fabuyonghu", fabuyonghu);
		m.addObject("list", map);
		m.addObject("jbxqlist", list);
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
	public int addapplu(String acontent,int uid,int uuid){
		try {
			int rs=cs.addapply(acontent, uid, uuid);
			return rs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
/*	@RequestMapping("ccc")
	@ResponseBody
	public void add() throws UnirestException{
		HttpResponse<String> response = Unirest.get("http://apis.haoservice.com/lifeservice/travel/HotelList?cityid=37&page=1&key=6bddf90ddbef40188600c2bcce9b32f9")
				  .asString();
		System.out.println(response.getBody());
	}*/
}
