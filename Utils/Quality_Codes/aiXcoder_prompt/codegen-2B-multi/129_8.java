import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		Calendar current =Calendar.getInstance();
		current.setTime(new Date()); 
		current.add(Calendar.MINUTE, minute);
		String str = current.getTime().toString(); 
		//System.out.println(str);
		
		return str;
	} 
	    public static void main(String[] args) 
	    {
	        // TODO Auto-generated method stub
	        System.out.print("minute:" +getNowDate(2));
	    	
	    }
}