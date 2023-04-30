import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		if (str == null || str1 == null) {
			return str;
		}
		int idx = str.indexOf(str1);
		if (idx == -1) {
			return str;
		}
		return str.substring(0, idx) + str2 + str.substring(idx + str1.length());
	}
	//实例里面,其实不是最基本的方法
}