import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			// Check if the input string is null or empty
		if(s == null || s.length() == 0){
			return "";
		}
		
		// Check if the input string has a decimal point
		if(!s.contains(".")){
			return s;
		}
		
		// Remove trailing 0's after decimal point
		s = s.replaceAll("0*$", "");
		
		// Remove decimal point if no digits remain after it
		s = s.replaceAll("\\.$", "");
		
		return s;
	}
	
	public static void main(String [] args){
		String num = "123.45000000";
		System.out.println(rvZeroAndDot(num));
	}
}