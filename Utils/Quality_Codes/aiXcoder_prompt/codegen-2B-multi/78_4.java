import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		int idx = str.indexOf(str1);
		if(idx!=-1){
			char c1 = str.charAt(idx);
			char c2 = str2.charAt(0);
			str = str.substring(0,idx) + c2 + str.substring(idx+str1.length());
		}
		return str;
	}

	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.8 (beta) modified by pivanof
	
}