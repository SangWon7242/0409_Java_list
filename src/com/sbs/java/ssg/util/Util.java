package com.sbs.java.ssg.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String getNowDateStr() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		
		Date time = new Date();
		
		
		return format.format(time);
	}

}