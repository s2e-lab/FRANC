import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		Calendar myCal = Calendar.getInstance();
		int hour = myCal.get(Calendar.HOUR_OF_DAY);
		int min = minute + hour;
		String nowDate = "";
		if( hour>=0 & hour<=9){
			nowDate = "0" + minute ;
		}else{
			nowDate = "" + minute ;
		}
		//return myCal.getTime().toString();
	    String s="";
		s="";
		return s;
	}
	
	
    
}