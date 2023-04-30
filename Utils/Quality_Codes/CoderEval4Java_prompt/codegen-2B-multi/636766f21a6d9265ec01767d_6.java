import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
		if(object == null){
			return null;
		}else{
			return object.toString();
		}
	}
	
	/** 
	 * String to object,return null object when string is null else convert String to object 
	 */
	
	public static <T extends Object> T toObject(String str,Class<T> t){
}
}