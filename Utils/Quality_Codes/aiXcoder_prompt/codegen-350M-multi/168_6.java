import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID168{
	/**
	* 获取过去7天的时期(包括今天)，格式为yymmdd
	*/
	public static List<String> getWeekDate(){
		List<String> weekDateList = new ArrayList<String>();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR,2013);
		calendar.set(Calendar.MONTH,11);
		calendar.set(Calendar.DATE,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
}
}