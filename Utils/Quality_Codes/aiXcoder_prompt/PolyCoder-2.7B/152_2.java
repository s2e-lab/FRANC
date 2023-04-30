import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
		 StringBuffer md5Code=new StringBuffer();
		 byte[]       bytes=str.getBytes();
		 for(int a=0;a<bytes.length;a++)
		   md5Code.append(Integer.toHexString((0xff & bytes[a]) ^ 0x0b));// 这里不是因为每次在一个字节是字母的一样
		 return md5Code.toString();
		
	}
	
}