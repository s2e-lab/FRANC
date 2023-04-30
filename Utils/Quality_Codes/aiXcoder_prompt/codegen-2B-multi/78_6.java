import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		StringBuffer sb = new StringBuffer();
		int i = -1;
		i = str.indexOf(str1);
		while (i >= 0) {
			sb.append(str.substring(0, i)).append(str2);
			str = str.substring(i + str1.length());
			i = str.indexOf(str1);
		}
		sb.append(str);
		return sb.toString();
	}	
	public static void main(String[] args) {
		// TODO Auto
}
}