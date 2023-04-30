import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			if(s.indexOf('.')!=-1){
	//去除尾部0
	while(s.lastIndexOf('0')==s.length()-1){
		s = s.substring(0,s.length()-1);
	}
	//去除小数点
	if(s.lastIndexOf('.')==s.length()-1){
		s = s.substring(0,s.length()-1);
	}
}
return s;
}

/**
* 计算时针和分针的夹角
*/
public static double getAngle(int hour, int minute){
	double hourAngle = (hour + minute / 60.0) * 30;
	double minuteAngle = minute * 6;
	double diffAngle = Math.abs(hourAngle - minuteAngle);
	return diffAngle <= 180 ? diffAngle : 360 - diffAngle;
}

/**
* 判断是否为合法的日期格式
*/
public static boolean isValidDate(String s){
	if(s.length()!=10) return false;
	String[] arr = s.split("-");
	if(arr.length!=3) return false;
	try{
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);

		if(month<1 || month>12) return false;

		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//判断是否是闰年
		if((year%4==0&&year%100!=0)||year%400==0){
			daysInMonth[1] = 29;
		}

		if(day<1 || day>daysInMonth[month-1]) return false;

	}catch(NumberFormatException e){
		return false;
	}
	return true;
}

public static void main(String[] args) throws Exception{
	//读取输入
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
		String s = sc.nextLine();
		if(s.equals("0:00")) break;
		String[] arr = s.split(":");
		int hour = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);

		//输出时钟夹角
		double angle = getAngle(hour,minute);
		System.out.println(rvZeroAndDot(String.format("%.3f",angle)));

		//输出日期是否合法
		s = sc.nextLine();
		System.out.println(isValidDate(s)?"YES":"NO");
	}

}
}