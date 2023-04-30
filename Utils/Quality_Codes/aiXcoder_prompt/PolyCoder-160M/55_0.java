import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID55{
	/**
	* 判断字符串是否只含字母和数字
	*/
	public static boolean isLetterOrDigit(String str){
			return (str.length() >= 2 && isLetter(str.charAt(1)));
	}

}