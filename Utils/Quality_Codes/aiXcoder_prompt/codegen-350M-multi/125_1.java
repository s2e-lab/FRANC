import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(dateTime));
		
		cal.add(6, 1);
		
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		if(month == cal.get(Calendar.MONTH) && day == cal.get(Calendar.DAY_OF_MONTH)){
			return day;
		}
		
		return 0;
	}

}
