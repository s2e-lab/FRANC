import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
			try {
				MessageDigest md5 = MessageDigest.getInstance("MD5");
				md5.update(str.getBytes());
				return MessageDigest.getInstance("MD5").digest(md5.digest()).toUpperCase();
			} catch (Exception e) {
				return "";
			}
	}
	
	/**
	* 解码字符串字符串为字符串
	*/
	public static String toString(String fromString, String charset){
		Charset charsetName=getCharsetFromCode(charset);
}
}