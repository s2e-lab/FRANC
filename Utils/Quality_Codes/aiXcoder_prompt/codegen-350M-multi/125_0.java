import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		Calendar c=Calendar.getInstance();
		int days=0;
		for(int i=0;i<(dateTime.length()-1);i++){
		   if(dateTime.charAt(i)+dateTime.charAt(i+1)=='D'){
		   days++;
		  }else if(dateTime.charAt(i+1)=='M'){
		   days++;
		  }
		}
		return days;
	}
}