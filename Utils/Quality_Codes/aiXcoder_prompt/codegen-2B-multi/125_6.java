import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		Calendar c = Calendar.getInstance();
		c.setTime(getDate(dateTime));
		int n = c.get(Calendar.DAY_OF_MONTH);
		//System.out.println(n);
		return n;
	}
	//方法二:比较方式
	public static int getDaysByMonth2(String dateTime) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.setTime(getDate(dateTime));
}
}