import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		 String t=str;
		if(t==null) t="";
		if(trailing == null) trailing="";
		String ret = t.concat(trailing);
		if(ret.substring(ret.length() - (ret.length()>0?ret.length() : 0) + 1,0).equals(trailing)) return str;
		
		return ret;
	}
	public static String appendTrailing(String str, String additionalValue){
		return appendTrailing(str, additionalValue, null);
	}
}