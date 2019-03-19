package com.aaa.Util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
	
	/**
	 * 单文件上传
	 * @param file 上传文件
	 * @param savePath 保存路径
	 * @return 文件保存路径
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public String upload(MultipartFile file, String savePath){
		//获取文件名称
		String filename = file.getOriginalFilename();
		String path = null;
		if (null != filename) {
			path = UUID.randomUUID()+filename;
			File newfile = new File(savePath+"/"+path);
			System.out.println(newfile);
			try {
				file.transferTo(newfile);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}
	
	/**
	 * 多文件上传
	 * @param files
	 * @param savePath
	 * @return
	 */
	public String[] multiupload(MultipartFile[] files, String savePath){
		String[] rs = new String[files.length];		
		for (int i = 0; i < files.length; i++) {
			rs[i] = upload(files[i],savePath);
		}
		return rs;
	}
	
	// 2.删除

	// 3.压缩zip

	// 4.解压zip
}
