import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID55{
	/**
	* 判断字符串是否只含字母和数字
	*/
	public static boolean isLetterOrDigit(String str){
			boolean z=true;

			for(int i=0; i<str.length();i++){
				if(str.charAt(i) =='' || str.charAt(i) == '_'){
					z=false;
				}
			}

			return z;
	}
	
	/**
	* 
	* @param str
	* @return
	*/	
	public static boolean equalLetters(String str){return isLetterOrDigit(str);}
}