import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date date=sdf.parse(dateTime);
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_MONTH, 7);
			return calendar.get(Calendar.DAY_OF_MONTH);
		} catch (Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	
}