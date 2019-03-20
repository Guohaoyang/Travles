package com.aaa.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.aaa.entity.city;
import com.aaa.entity.comemessage;
import com.aaa.entity.scenicspots;
import com.aaa.entity.travelnotes;
import com.aaa.entity.tusers;
import com.aaa.service.myselfService;

@Controller
@RequestMapping("myself")
public class myselfController {
	@Autowired
	myselfService ms;
	@RequestMapping("querycity")
	public String querycity(Model m,HttpSession s){
		tusers map =  (tusers) s.getAttribute("loginqlist");
		List<city> citys = ms.querycity();
		List<scenicspots> scenicspot = ms.queryscenicspots();
		Map<String,Object> company = ms.queryChange().get(0);
		m.addAttribute("company",company);
		m.addAttribute("citys",citys);
		m.addAttribute("scenicspot",scenicspot);
		m.addAttribute("list", map);
		return "zhu";
	}
	
	
	@RequestMapping("my")
	public String my(Model m,HttpSession s){
		tusers map =  (tusers) s.getAttribute("loginqlist");
		Integer uid = map.getUid();
		tusers users = ms.queryusers(uid).get(0);
		List<tusers> fans = ms.queryfans(uid);
		Integer fansnum = fans.size();
		List<tusers> danas = ms.querydana(uid);
		Integer dananum = danas.size();
		List<travelnotes> trave = ms.querytrave(uid);
		Integer travenum = trave.size();
		List<comemessage> comes =ms.querycome(uid);
		Integer comenums = comes.size();
		List<Map<String, Object>> collect = ms.queryCollect(uid);
		Integer collectNum = collect.size();
		List<Map<String,Object>> strats = ms.queryStrategy(uid);
		Integer stratgyNums = strats.size();
		System.out.println("stratgyNums"+stratgyNums);
		m.addAttribute("strats",strats);
		m.addAttribute("stratgyNums",stratgyNums);
		m.addAttribute("users",users);
		m.addAttribute("fans",fans);
		m.addAttribute("dana",danas);
		m.addAttribute("trave",trave);
		m.addAttribute("comes",comes);
		m.addAttribute("collect",collect);
		m.addAttribute("collectNum",collectNum);
		m.addAttribute("comenums",comenums);
		m.addAttribute("travenum",travenum);
		m.addAttribute("fansnum",fansnum);
		m.addAttribute("dananum",dananum);
		return "myself";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public Integer addAttention(HttpSession s,Integer usid){
		tusers map =  (tusers) s.getAttribute("loginqlist");
		Integer uid = map.getUid();
		Integer add = ms.addAttention(uid, usid);
		return add;
	}
	
	@RequestMapping("del")
	@ResponseBody
	public Integer delAttention(HttpSession s,Integer usid){
		tusers map =  (tusers) s.getAttribute("loginqlist");
		Integer uid = map.getUid();
		Integer add = ms.delAttention(uid, usid);
		return add;
	}
	
	@RequestMapping("delCollect")
	@ResponseBody
	public Integer delCollect(Integer tid,HttpSession s){
		tusers map =  (tusers) s.getAttribute("loginqlist");
		Integer uid = map.getUid();
		Integer nums = ms.delCollect(tid, uid);
		return nums;
	}
	
	@RequestMapping("showupd")
	public String showupd(Model m,HttpSession s){
		tusers map =  (tusers) s.getAttribute("loginqlist");
		Integer uid = map.getUid();
		tusers tt = ms.queryusers(uid).get(0);
		m.addAttribute("tt", tt);
		return "updMyself";
	}

	@RequestMapping("edit")
	public String edit(tusers t,MultipartFile pic){
		//System.out.println(t);
		String Filename = pic.getOriginalFilename();
		if(Filename==null){
			ms.edit(t);
		}else{
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyyMMddHHmmss");
			Date nowtime=new Date();
			String formatnowtime=formatDate.format(nowtime);
			String upic = "static/myselfimg/"+formatnowtime+".jpg";
			//F:\soft\study\Git\Git\local\Travle\target\classes\static\myselfimg
			File picfile = new File("F:/soft/study/Git/Git/local/Travle/target/classes/"+upic);
			//F:/soft/study/Git/Git/local/Travle/src/main/resources/static/myselfimg/
			try {
				pic.transferTo(picfile);
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			upic = "../"+upic;
			t.setUpic(upic);
			ms.edit(t);
		}
		return "redirect:my?uid="+t.getUid();
		
	}
	
	@RequestMapping("/uploadOnePic")
    @ResponseBody
    public String fileUpload(String inputId, MultipartHttpServletRequest request) {
        try {
            MultipartFile realPicFile = request.getFile(inputId);
            if (realPicFile != null) {
                // 取得当前上传文件的文件名称
                String myFileName = realPicFile.getOriginalFilename();
                // 如果名称不为“”,说明该文件存在，否则说明该文件不存在
                if (myFileName.trim() != "") {
                    // 重命名上传后的文件名
                    SimpleDateFormat formatDate = new SimpleDateFormat("yyyyMMddHHmmss");
                    Date nowtime=new Date();
        			String formatnowtime=formatDate.format(nowtime);
                    String fileName = formatnowtime + realPicFile.getOriginalFilename().split(".", 4);
                    // 定义上传路径
                    String path = "F:/soft/study/Git/Git/local/Travle/src/main/resources/static/myselfimg/" + fileName;
                    String pathReturn = "../static/myselfimg/" + fileName;
                    File localFile = new File(path);
                    realPicFile.transferTo(localFile);
                    return pathReturn;
                }
            }
        } catch (Exception e) {
            // LOG.error("upload header picture error : ", e);
        }
        return null;
    }
	
	@RequestMapping("showfans")
	public String showfans(Model m,HttpSession s,Integer usid,Integer status) throws Exception{
		tusers map =  (tusers) s.getAttribute("loginqlist");
		Integer uid = map.getUid();
		//status 1关注2没有关注过uid是登陆者id usid是查询uid的主键
		if(uid!=usid){
			tusers useres = ms.queryusers(uid).get(0);
			tusers users = ms.queryusers(usid).get(0);
			List<tusers> fans = ms.queryfans(usid);
			Integer fansnum = fans.size();
			List<tusers> danas = ms.querydana(usid);
			List<tusers> da = ms.querydana(uid);
			List<travelnotes> trave = ms.querytrave(usid);
			Integer travenum = trave.size();
			Integer dananum = danas.size();
			List<comemessage> comes =ms.querycome(usid);
			Integer comenums = comes.size();
			List<Map<String, Object>> collect = ms.queryCollect(usid);
			Integer collectNum = collect.size();
			m.addAttribute("users",users);
			m.addAttribute("useres",useres);
			m.addAttribute("fans",fans);
			m.addAttribute("dana",danas);
			m.addAttribute("da",da);
			m.addAttribute("trave",trave);
			m.addAttribute("comes",comes);
			m.addAttribute("collect",collect);
			m.addAttribute("collectNum",collectNum);
			m.addAttribute("comenums",comenums);
			m.addAttribute("travenum",travenum);
			m.addAttribute("fansnum",fansnum);
			m.addAttribute("dananum",dananum);
			return "fans";
		}else{
			my(m,s);
			return "myself";
		}
	}
}
