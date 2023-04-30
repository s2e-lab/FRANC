import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID168{
	/**
	* 获取过去7天的时期(包括今天)，格式为yymmdd
	*/
	public static List<String> getWeekDate(){
		List<String> list = new ArrayList<String>();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 7);
		String currentDay = calendar.getTime().toString();
		String lastDay = calendar.getTime().toString();
		
		int hour =calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
}
}