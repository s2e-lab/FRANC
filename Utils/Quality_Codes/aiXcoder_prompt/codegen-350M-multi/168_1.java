import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID168{
	/**
	* 获取过去7天的时期(包括今天)，格式为yymmdd
	*/
	public static List<String> getWeekDate(){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		return getWeekDate(cal.getTime());
	}
	public static String setWeekDate(List<String> list){
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=list.size();i++){
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}