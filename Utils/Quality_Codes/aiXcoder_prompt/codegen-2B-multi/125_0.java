import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		/**
		* 时间格式为:yyyy-MM-dd
		*/
		Calendar startDate = Calendar.getInstance();
		startDate.setTime(stringToDate(dateTime));
		
		Calendar endDate = Calendar.getInstance();		
		endDate.setTime(stringToDate("1989-6-2"));		
		
		// 添加得到每月第一天的时间
}
}