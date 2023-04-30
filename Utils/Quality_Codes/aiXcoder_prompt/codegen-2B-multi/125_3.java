import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID125{
	/**
	* 判断某个日期属于本月的第几天
	*/
	public static int getDaysByMonth(String dateTime){
		//格式"20120101"与20120102为两个月的1日 与 2日
		String[] numArray = dateTime.split("");
		int day = Integer.parseInt(numArray[3])-1;
		return day;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(getDaysByMonth("20201215"));

}
}