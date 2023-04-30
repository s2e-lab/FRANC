import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		if (dateTime!=null &&dateTime.length()==8){
			int year = new Integer(dateTime.substring(0,4));//获取年
			int m = new Integer(dateTime.substring(5,7));//获取月份
			int d = new Integer(dateTime.substring(8));//获取日
			Calendar cal = Calendar.getInstance();
			cal.set(year,m,d);
			int day = cal.getActualMaximum