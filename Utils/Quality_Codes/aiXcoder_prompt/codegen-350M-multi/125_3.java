import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		String[] st = dateTime.split("-");
		int day =Integer.parseInt(st[0].substring(5,7)) + 1;
		if(day>31){
			day = day % 32;
		}
		return day;
	}
	
	public static void main(String[] args)throws Exception{
		
		String date = DateUtil.getDay(new Random(1).nextLong());
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();
}
}