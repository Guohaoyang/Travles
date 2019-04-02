package com.aaa.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	/**

	 * 将字符串转换成时间

	 * 

	 * @param source

	 *            字符串

	 * @param pattern

	 *            传入当前字符的格式

	 * @return 发生错误时返回当前时间

	 */
	
	
	public static Date StringToDate(String source, String pattern) {

		Date date = null;

		try {

			SimpleDateFormat sdf = new SimpleDateFormat(pattern);

			date = sdf.parse(source);

		} catch (ParseException e) {
			date = new Date();
		}

		return date;

	}

}
