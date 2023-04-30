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
		String date;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyymmdd");      
		ArrayList monthList = new ArrayList<String>();
		for(int i=0;i<365;i++){
			Date date1 = new Date();  
			date1.setToNow();  
			monthList.add(dateFormat.format(date1));
			date = dateFormat.format(date1);
			list.add(date);
		}
}
}