import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID168{
	/**
	* 获取过去7天的时期(包括今天)，格式为yymmdd
	*/
	public static List<String> getWeekDate(){
		DateFormat format = new SimpleDateFormat("yyyymmdd");
		List<String> list = new ArrayList<String>();
		java.util.Calendar cal = Calendar.getInstance();
		cal.add(java.util.Calendar.DATE, -7);
		try{
			String date = format.format(cal.getTime());
			list.add(date);
		}
		catch(Exception e){
		}
		return list;
	}
}