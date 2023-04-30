import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID142{
	/**
	* 获取url的顶级域名
	*/
	public static String getTopDomain(String url){
		int idx=url.indexOf("./");
		if(idx!=-1){
			url=url.substring(0,idx);
		}
		return url;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String url = "http://x.qq.com/";
		
		String topDomain = getTopDomain(url);
		//不含.的第一个域名
}
}