package com.aaa.service;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletSecurityElement;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FilePathService {
	public String Upload(@RequestParam("file") MultipartFile file) {
		String url=null;
		if(!file.isEmpty()) {
			// 获取文件名称,包含后缀			
			String fileName = file.getOriginalFilename();		
			// 存放在这个路径下：该路径是该工程目录下的static文件下：(注：该文件可能需要自己创建)
			// 放在static下的原因是，存放的是静态文件资源，即通过浏览器输入本地服务器地址，加文件名时是可以访问到的
			String path = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/song";
			//System.out.println("path:"+path);
			try {
				// 该方法是对文件写入的封装，在util类中，导入该包即可使用，后面会给出方法				
				//FileUtil.fileUpload(file.getBytes(), path, fileName);
				String afilename=path+ "/"+fileName;
				//System.out.println("全路径+文件+后缀:"+afilename);
				File f=new File(afilename);
				file.transferTo(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			url="http://localhost:8080/Travle/static/song/"+fileName;
			//System.out.println("url:"+url);
		}
		return url;
	}
}
