import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID142{
	/**
	* 获取url的顶级域名
	*/
	public static String getTopDomain(String url){
		String domain1=null;
		int top=0;
		top=findTop(url);
		if (top!=-1)
		{
			String domain=url.substring(0,top);
			domain1=domain.substring(2);
		}
		return domain1;
	}
	
	/*********************************************************
	* 获取domain的level
	*/
	public static int findTop(String url){
		int top=0;
		int index=1;
		
}
}