import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
		 //定义一组加密的方法，用哈希表存储
		 //对数字的使用
		 StringBuffer longNumber = new StringBuffer();
		 for(int i=0;i<str.length();i++){
		     longNumber.append(str.charAt(i));
	         }
	     long tmp = new BigInteger(longNumber.toString(),16);
	     long temp = new BigInteger(32,tmp);
	     //将32组成 32 密钥
}
}