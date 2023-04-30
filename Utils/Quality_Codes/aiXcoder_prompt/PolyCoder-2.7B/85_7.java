import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		 if(str == null || str.equals("") || str.equals(trailing))
    return str;
    StringBuffer res = new StringBuffer(str.length() - trailing.length());
    StringBuilder sb=new StringBuilder(str);
    sb.append(trailing);
		sb.append(str.substring(0,str.length()-2));
		sb.append(trailing);
		res.append(sb);
	    return res.toString();
	  }
}