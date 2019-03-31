package com.aaa.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.aaa.entity.Pages;
import com.aaa.entity.city;
import com.aaa.entity.scenicspots;
import com.aaa.entity.tadmin;
import com.aaa.service.AdminServiceYl;
import com.aaa.util.FileUtils;

@Controller
@RequestMapping("houtais")
public class ylBackController {

	@Autowired
	AdminServiceYl yl;
	
	/**
	 * 导航栏
	 * @return
	 */
	@RequestMapping("index")
	public String index(HttpSession session){
		int UserNum = yl.UserNum();
		session.setAttribute("UserNum", UserNum);
		int scenicspotsNum = yl.scenicspotsNum();
		session.setAttribute("scenicspotsNum", scenicspotsNum);
		int travelnotesNum = yl.travelnotesNum();
		session.setAttribute("travelnotesNum", travelnotesNum);
		int strategyNum = yl.strategyNum();
		session.setAttribute("strategyNum", strategyNum);
		int comemessage = yl.comemessage();
		session.setAttribute("comemessage", comemessage);
		Integer cityNum = yl.cityNum();
		session.setAttribute("cityNum", cityNum);
		return "houtai/index";
	}
	
	
	@RequestMapping("orderlist")
	public String orderlist(){
		return "houtai/order-list";
	}
	
	
	/**
	 * 主页面
	 * @return
	 */
	@RequestMapping("welcome")
	public String welcome(){
		return "houtai/welcome";
	}
	
	@RequestMapping("my")
	public String my(){
		return "houtai/1";
	}
	
	/**
	 * 忘记密码页面
	 * @return
	 */
	@RequestMapping("forgetPwd")
	public String forgetPwd(){
		return "houtai/member-password";
	}
	
	/**
	 * 个人信息页面
	 * @return
	 */
	@RequestMapping("mySelf")
	public String mySelf(Integer tid,Model model){
		tadmin queryByTid = yl.queryByTid(tid);
		model.addAttribute("queryByTid", queryByTid);
		model.addAttribute("tid", tid);
		return "houtai/admin-edit";
	}
	
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("login")
	public String login(){
		return "houtai/login";
	}
	
	/**
	 * 后台登录的方法
	 * @param tname
	 * @param tpwd
	 * @param session
	 * @return
	 */
	@RequestMapping("loginAdmin")
	public String loginAdmin(String tname,String tpwd,HttpSession session){
		tadmin loginAdmin = yl.loginAdmin(tname, tpwd);
		if (null != loginAdmin) {
			session.setAttribute("loginAdmin", loginAdmin);
			System.out.println(loginAdmin);
			return "forward:index"; 
		}
		return "forward:login";
	}
	
	/**
	 * 管理员修改自己的信息
	 * @param admin
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="updateAdminYl")
	public String updateAdminYl(tadmin admin,MultipartFile file) throws IOException{
		FileUtils fu = new FileUtils();
		String savePath  = "F:/images/";
		String path = fu.upload(file, savePath);
		admin.setTpic(path);
		int update = yl.updateAdminYl(admin);
		System.out.println("update:"+update);
		return "redirect:/houtais/mySelf?tid="+admin.getTid();
	}
	//查询所有景点页面
	@RequestMapping("queryScenicspots")
	public String queryScenicspots(String pageIndex,Model model){
		if(null == pageIndex){
			pageIndex="1";
		}
		Pages page = new Pages();
		Integer size =  yl.scenicspotsNum();//获取总条数
		page.setCount(size);
		page.setPageIndex(Integer.valueOf(pageIndex));//设置当前页数
		page.setPageSize(6);//设置每个显示的条数
		page.setTotalPage(page.getTotalPage(size, page.getPageSize()));
		model.addAttribute("page", page);
		List<Map<String, Object>> queryScenicspots = yl.queryScenicspots(page);
		model.addAttribute("queryScenicspots", queryScenicspots);
		model.addAttribute("pageIndex", pageIndex);
		model.addAttribute("size", size);
		return "houtai/scenicspotssss";
	}
	@RequestMapping("queryCity")
	public String queryCity(Model model,String pageIndex){
		if(null == pageIndex){
			pageIndex="1";
		}
		Pages page = new Pages();
		Integer size =  yl.cityNum();//获取总条数
		page.setCount(size);
		page.setPageIndex(Integer.valueOf(pageIndex));//设置当前页数
		page.setPageSize(6);//设置每个显示的条数
		page.setTotalPage(page.getTotalPage(size, page.getPageSize()));
		model.addAttribute("page", page);
		List<city> queryCity = yl.queryCity(page);
		model.addAttribute("queryCity", queryCity);
		model.addAttribute("pageIndex", pageIndex);
		model.addAttribute("size", size);
		return "houtai/citylist";
	}
}
