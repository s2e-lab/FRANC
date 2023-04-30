import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		
		int month=Integer.parseInt(dateTime.substring(10,12));
		int hour=Integer.parseInt(dateTime.substring(12,14));
		int dayofweek=Math.abs((Integer.parseInt(dateTime.substring(8,10)) - (7 * (dayofweek-1))))+dayofweek;
		
		
}
}