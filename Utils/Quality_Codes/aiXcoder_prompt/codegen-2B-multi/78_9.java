import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		// write code here
		str=str.trim();
		if (str.length()==0)
			return str;
		int i;
		char[] ch=str.toCharArray(); 
		for (i=0;i<ch.length;i++)
		{
			if (ch[i]==str1.charAt(0)) {
				str=str.substring(0,i)+str2+str.substring(i+1);
				break; 
			}
		}
		return str;
	}
}