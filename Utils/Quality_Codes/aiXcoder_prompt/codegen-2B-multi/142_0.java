import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID142{
	/**
	* 获取url的顶级域名
	*/
	public static String getTopDomain(String url){
		String domain = "";
		try{
			URL _url = new URL(url);
			//获取域名
			String _domain = _url.getHost().split("\\.")[1];
			if(_domain == ""){
				_domain = _url.getHost();
			}
			domain = _domain;
		}catch(Exception e){}
		return domain;
	}

	public static void main(String args[]){
		//输出
}
}