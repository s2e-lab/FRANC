import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		 if(str!=null&&str.trim()!=null&&(!trailing.equals("")&&(str.trim()!=str.trim().trim()	||	str.trim().length()==0 || str.trim().startsWith("--")	||	str.trim().endsWith("--"))))
			 return str+trailing;
		return str;
	}
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
}