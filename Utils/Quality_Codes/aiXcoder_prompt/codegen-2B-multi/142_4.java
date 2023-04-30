import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID142{
	/**
	* 获取url的顶级域名
	*/
	public static String getTopDomain(String url){
		Map <String, String> map = new HashMap<String,String>();
		if (url == null || url.equals("")) return null;
		//判断是否带有参数
		String temp =(new String(url.getBytes()))
				.toLowerCase().contains("?")?
				(new String(url.getBytes())).split("\\?")[1]:"";
		if(temp == null || temp.equals("")) return null;
		temp = getDomain(temp, map);
}
}