import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:");
		Date today = null;
		try{
			today = format1.parse("2017-11-03 11:59:33");
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		String nowDate;
}
}