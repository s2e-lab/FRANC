import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		Date date =new Date(Integer.parseInt(dateTime.substring(3,7)));//把日朰抽出此日期
		Calendar calendar =Calendar.getInstance();
		calendar.setTime(date);
		return (int)calendar.get(Calendar.DAY_OF_MONTH);
	}


	public static void main(String[] args)  throws IOException, IllegalArgumentException{
		double sum = 0;
}
}