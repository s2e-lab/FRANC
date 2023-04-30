import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID129{
	/**
	* 获取当前系统时间 minute分钟后 的时间
	*/
	public static String getNowDate(int minute){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		Date d = new Date();//获取当前类秒 格式化
		String result = sdf.format(d);
		System.out.println("时间:"+result);

		long time = System.currentTimeMillis();
		
		BigInteger bi = new BigInteger(Long.toString(time));  
		BigDecimal bd = new BigDecimal(bi);  
}
}