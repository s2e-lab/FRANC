import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str!=null && !str.trim().equals("") && !str.endsWith(trailing)){
				return str+trailing;
			}
			return str;
		}

	/**
	* Takes a string and checks if it represents a valid integer or not
	*/
	public static boolean isInteger(String str){
		try{
			Integer.parseInt(str);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}

	/**
	* Counts the number of occurrences of a substring in a given string
	*/
	public static int countSubstring(String str, String subStr){
		int count = 0;
		int i = 0;
		while((i = str.indexOf(subStr, i)) != -1){
			count++;
			i++;
		}
		return count;
	}

	/**
	* Rounds a double value to the specified number of decimal places 
	*/
	public static double round(double value, int numDecimalPlaces){
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(numDecimalPlaces, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}