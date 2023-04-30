import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
		String temp="";
		if(object!=null){
			temp=object.toString();
		}
		
		return temp;
	}
	/** 
	 * Object to String,when null object then return blank else return toString(); 
	 */
	
	public static String toString(Object object,String blank){
		String temp="";
		if(object!=null){
			temp=object.toString();
		}
		
		if(blank==null){
			return temp;
		}
}
}