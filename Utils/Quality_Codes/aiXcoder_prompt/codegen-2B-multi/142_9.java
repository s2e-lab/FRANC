import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID142{
	/**
	* 获取url的顶级域名
	*/
	public static String getTopDomain(String url){
		String topDomain = "";
		String domain = url.substring(url.indexOf(":")+1);
		int indexOf = domain.indexOf("/");
		String topDomainName = domain.substring(0, indexOf);
}
}