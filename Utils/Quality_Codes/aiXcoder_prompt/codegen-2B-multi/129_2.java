import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		try{
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHH:mm");
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.MINUTE, minute);
			String date = df.format(cal.getTime()); 
			return date;
		} catch(Exception e){
			return "";
		}
	}
}