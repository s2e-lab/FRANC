import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		 if (str==null) return (null);
	
		 String res = null;
		 try{
			 res = (new String(str.getBytes(), "ASCII")).replaceAll(((new String(str.getBytes(), "UTF-8"))).trim(), (new String(trailing==null?"":trailing.getBytes(), "ASCII")).trim());
		 }catch(Throwable notDefined){}
		 return (res);
	}
	/**
	* Appends the contents of the passed in FileStream to the given File
	*/
}