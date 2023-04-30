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
		int index=url.indexOf("/");
		int index1=url.lastIndexOf("/");
		topDomain=url.substring(0,index+1);
		System.err.println("url="+url+" url.lastIndexOf="+url.lastIndexOf("/")+" index="+index+" index1="+index1);
		return topDomain+ url.substring(index+1, index1);
	}
}