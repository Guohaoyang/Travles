package com.aaa.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
	
	//虚拟路径
	 @Value("${file.uploadWindow}")
	 private String UPLOAD_WINDOW;
	 
	 @Value("${file.uploadLinux}")
	 private String UPLOAD_LINUX;
		 
	 public String singleFile(MultipartFile file) {
	        if (Objects.isNull(file) || file.isEmpty()) {
	            return "文件为空!";
	        }
	        try {
	            byte[] bytes = file.getBytes();
	            String UPLOAD_FOLDER;
	            //若当前系统是window系统
	            if(System.getProperty("os.name").toLowerCase().contains("windows")) {
	                UPLOAD_FOLDER = UPLOAD_WINDOW;
	            }else{
	                //若当前系统是linux系统
	                UPLOAD_FOLDER = UPLOAD_LINUX;
	            }
	            //File.separator表示分隔符
	            //file.getOriginalFilename()表示文件全名(包括后缀名)
	            Path path = Paths.get(UPLOAD_FOLDER + File.separator + getFilename(file.getOriginalFilename()));
	            //如果没有此文件夹，则创建
	            if (!Files.isWritable(path)) {
	                Files.createDirectories(Paths.get(UPLOAD_FOLDER));
	            }
	            //文件写入指定路径
	            Files.write(path, bytes);
	            //若上传成功
	            return "上传成功";
	        } catch (IOException e) {
	            //若发生异常
	            return "发生异常";
	        }
	    }
	 
	 
	 	/**
	     * 设置文件名,防止相同文件名冲突
	     * 原名称+时间(年月日)+后缀
	     * @param originalFilename 原名称
	     * @return string
	     */
	    private String getFilename(String originalFilename) {
	        //后缀名  如 .txt
	        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
	        //后缀名之前的名称
	        String prefix = originalFilename.substring(0, originalFilename.lastIndexOf("."));
	        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
	        // 将此时时间转换为字符串
	        String formatDate = format.format(new Date());
	        // 拼接文件名
	        String filename = new StringBuffer().append(prefix).append("_").append(formatDate).append(suffix).toString();
	        return filename;
	    }

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
}
