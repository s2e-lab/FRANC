import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		int sec = minute * 60;//获取秒数
		int hour = sec / 3600;//获取小时数
		int min = sec/60;
		String sHour = (hour < 10? "0"+hour:hour+"");
		String sMin = (min < 10? "0" + min : min + "");
		String sTime = (hour <10? "0" + min : min + ":00");
		System.out.println(sTime);
}
}