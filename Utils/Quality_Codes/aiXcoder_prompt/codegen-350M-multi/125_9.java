import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		int result = 0;
		String date = "";
		int index = 1;
		if(!dateTime.substring(0,10).equals("12")) index++;
		if(!dateTime.substring(0,9).equals("11") &&!dateTime.substring(0,8).equals("10")) index++;
		if(!dateTime.substring(0,8).equals("10") && !dateTime.substring(0,6).equals("07")) index++;
}
}