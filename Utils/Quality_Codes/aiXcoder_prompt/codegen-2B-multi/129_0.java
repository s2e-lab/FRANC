import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		// 毫秒数 0-86399999999
		String st = Long.toString(System.currentTimeMillis());

		// 某几分钟的时间
		String time = "";
		String sub = st.substring(st.length() - minute, st.length() - 1);
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < minute; ++i){
			str.append(sub);
		}
		time = str.toString();


}
}