import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		if(str==null||str1==null||str2==null){
			return null;
		}
//		return str.replaceAll(str1,str2);
		String s=str.indexOf(str1)!=-1?str.replaceAll(str1,str2):"";
		return s;
	}

}