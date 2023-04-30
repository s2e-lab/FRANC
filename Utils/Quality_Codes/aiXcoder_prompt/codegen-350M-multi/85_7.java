import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		if(str==null || str.equals(""))return null;
		if(trailing==null){
			if(str.lastIndexOf(Constants.STR_CONSTANT_ESC)==-1)return str;
			ArrayList list=new ArrayList(Arrays.asList(String.valueOf(Constants.STR_CONSTANT_ESC)));
			return list.toString();
		}
		return str+trailing;
	}//end of appendTrailing

}