import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		if (str == null || str2 == null || str1 == null) return null;
		StringBuilder builder = new StringBuilder("");
		
		for (int i=0; i< str.length(); i++){
			if (str.substring(i,i+str1.length()).equals(str1)){
				builder.append(str2);
				break;
			}else {
				builder.append(str.charAt(i));
			}
		}
		
		return builder.toString();
	}

	
}