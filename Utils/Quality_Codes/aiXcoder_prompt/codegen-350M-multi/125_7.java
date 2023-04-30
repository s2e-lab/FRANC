import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		SimpleDateFormat format=new  SimpleDateFormat("yyyyMMdd");
		Date date = new Date(format.parse(dateTime,"yyyy-MM-dd").getTime());
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		while (c.get(Calendar.DAY_OF_MONTH)<14){
			c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH));
		}
}
}