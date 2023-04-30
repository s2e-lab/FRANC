import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
		 MD5 md5 = new MD5();
		 md5.update(str);
		 return md5.digest();
	}
	
	public static void main(String [] args) {
		 if(args.length!=2){
			 System.out.println("输入: [原字符串]");
			 System.out.println("输出: [二进制串]：");
			 System.out.println("MD5计算结果: <" + toMd5Code(args[0]) + ", " + args[1] + ">");
		 }
}
}