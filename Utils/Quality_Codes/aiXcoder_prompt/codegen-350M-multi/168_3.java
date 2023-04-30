import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID168{
	/**
	* 获取过去7天的时期(包括今天)，格式为yymmdd
	*/
	public static List<String> getWeekDate(){
		GregorianCalendar cal = new GregorianCalendar();
		cal.roll(Calendar.DAY_OF_MONTH,7);
		cal.set(Calendar.DAY_OF_MONTH,0);
		cal.get(Calendar.DAY_OF_WEEK,0);
		
		String startDate = "0";	
		DateFormat df = new SimpleDateFormat("yymmdd");//当前是一天今天的日期
		
}
}