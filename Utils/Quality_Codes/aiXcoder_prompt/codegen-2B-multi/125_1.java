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
		* 获得当前日期时间的年份
		*/
		int year =getYearByDateTime(dateTime);
		/**
		* 获得当前日期时间的月份的数
		*/
		int month =getMonthByDateTime(dateTime);
		
		GregorianCalendar gc=new GregorianCalendar(year,month,1);
}
}