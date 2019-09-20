package com.yangendian.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
		
	
	public static Date getDateByInitMonth(Date src){
		
		
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		
		c.add(Calendar.YEAR, -1900);
		
		c.add(Calendar.MONTH, -1);
		
		c.set(Calendar.DATE, 1);
		
		c.set(Calendar.HOUR,0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND,0);
		
		
		return c.getTime();
	}
	
	
	@SuppressWarnings("deprecation")
	public static Date getDateByFullMonth(Date src){
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(src);
		
		
		c.add(Calendar.YEAR, -1900);
		
		
		c.set(Calendar.DAY_OF_MONTH, 0);
		
		
		c.set(Calendar.HOUR, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		
		
		return c.getTime();
		
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		Date date = getDateByFullMonth(new Date(2000,9,20,11,12,25));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String da = format.format(date);
		System.out.println(da);
		
		
		
		Date date1 = getDateByInitMonth(new Date(2000,9,20,11,12,25));
		
		String da1 = format.format(date1);
		System.out.println(da1);
	}
	
	
	
}
