import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID168{
	/**
	* 获取过去7天的时期(包括今天)，格式为yymmdd
	*/
	public static List<String> getWeekDate(){
		ArrayList<String> weekList = new ArrayList<String>();
		ArrayList<String> day = new ArrayList<String>();
		String date = "0";
		String year = "0";
		String month = "0";
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);
		
}
}