import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		String yyyy_MM_dd = dateTime;
		if(yyyy_MM_dd == null || yyyy_MM_dd.length()!= 10 || yyyy_MM_dd.charAt(4)!= '/' 
				|| yyyy_MM_dd.charAt(7)!= '/' || yyyy_MM_dd.charAt(8)!= '0' || yyyy_MM_dd.charAt(11)!= ':')
			return 0;

}
}