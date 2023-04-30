import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID142{
	/**
	* 获取url的顶级域名
	*/
	public static String getTopDomain(String url){
		String topDomain="";
		if(url.indexOf("http://")!=-1){
			topDomain=url.substring(url.startsWith("http://")?5:4,url.length());
		}
		if(url.indexOf("https://")!=-1){
			topDomain=url.substring(url.startsWith("https://")?7:6,url.length());
		}
}
}