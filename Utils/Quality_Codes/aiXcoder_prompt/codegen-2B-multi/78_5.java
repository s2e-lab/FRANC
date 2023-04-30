import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		int index = str.indexOf(str1);
		if(index == -1) return str;
		return str.replaceFirst(str1, str2);
	}
	public static void main(String[] args) {
		System.out.println(replaceFirst("abcd", "d", "e"));
	}
}
