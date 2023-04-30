import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID55{
	/**
	* 判断字符串是否只含字母和数字
	*/
	public static boolean isLetterOrDigit(String str){
		
//	String toCheck = str.toLowerCase();
		boolean inReverse = false;
//	return( toCheck.contains( Character.toLowerCase(str.charAt(0)) ) );

		if(str.length()==0){
			return false;
		}
		if(str.charAt(0)=='.'){
			inReverse = true;
			return(false);
		
		}
		String s = str.substring(1);

		int len = s.length();
}
}