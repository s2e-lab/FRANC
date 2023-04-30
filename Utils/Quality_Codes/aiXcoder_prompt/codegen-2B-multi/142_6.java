import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID142{
	/**
	* 获取url的顶级域名
	*/
	public static String getTopDomain(String url){
		url = URLEncoder.encode(url);
		StringBuffer sb = new StringBuffer();	
		String uri = url.replaceAll(" ", "%20");
		uri = uri.substring(0, uri.length()-1);
		String token="",head="//";

}
}