import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		try
		{
			return str.substring(start,end);
		}
		catch(IndexOutOfBoundsException ioobe){
			return null;
		}
	}

	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	public static String sub2(String str, int start, int end){
		try
		{
			return str.substring(start,end);
		}
		catch(IndexOutOfBoundsException ioobe){
			return null;
		}
	}


}