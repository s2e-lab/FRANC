import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID55{
	/**
	* 判断字符串是否只含字母和数字
	*/
	public static boolean isLetterOrDigit(String str){
			//首字母或数字
			for (int i = 0; i < str.length(); i++){
				char c = str.charAt(i);
				if (('A' <= c) ||('a' <= c) ||('A' <= c)) continue;
				return false;
			}
		return true;
	}
	
	/**
	* 查看是否有一个空格，但不限于数字或特殊字符
	*/
}