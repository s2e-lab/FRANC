import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				 // 最后两次循环去2
				if(c=='a'){
					sb.append(Character.toUpperCase(String.valueOf(c)));
				}else{
					sb.append(c);
				}
			}
		 return sb.toString();
  }
    
}