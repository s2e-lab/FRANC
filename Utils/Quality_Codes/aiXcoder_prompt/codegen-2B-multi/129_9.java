import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		String date[] = {"","00","55","25","25","50","50"};
		long now = System.currentTimeMillis();

		now += (minute * 60000);

        String today = new SimpleDateFormat("HH:mm:ss").format(new Date(now));
		Integer temp = Integer.parseInt(today);

		if(temp < 10)date[0] = "0";
		if(temp < 30)date[1] = "0";
		if(temp < 50)date[2] = "0";
}
}