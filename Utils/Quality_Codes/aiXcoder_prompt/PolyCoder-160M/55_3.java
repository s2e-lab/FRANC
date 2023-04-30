import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID55{
	/**
	* 判断字符串是否只含字母和数字
	*/
	public static boolean isLetterOrDigit(String str){
		 
		 if(str.length() < 5) return false;
           char c = str.charAt(0);
           if(Character.isLetter(c)) return true;
           
           if(!Character.isDigit(c)) return false;
           if(c >= 'a' && c <= 'z') return true;
         
}
}