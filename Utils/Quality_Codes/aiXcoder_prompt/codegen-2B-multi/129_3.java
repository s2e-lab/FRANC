import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		Calendar c = Calendar.getInstance();
		String strT = c.get(Calendar.MINUTE)+ "";
		if(strT.length()==1){
			strT = "0"+strT;
		}
		String strNowTime=c.get(Calendar.YEAR)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.DAY_OF_MONTH)+" "+c.get(Calendar.HOUR_OF_DAY)+":"+strT;
}
}