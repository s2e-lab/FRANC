import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
		 
		StringBuffer md5 = new StringBuffer();
		try {
			md5.append(str);
			md5.append(MD5Code.toMD5Code());
		} catch(UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return md5.toString();
	}
	
}