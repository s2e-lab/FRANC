import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
		if(object == null || String.valueOf(object).trim().length() == 0){
			return null;
		}else{
			return object.toString();
		}
	}

	/**
	 * Object to Integer,when null object then null
	 * @param object
	 * @return
	 */
	public static Integer toInteger(Object object) {
}
}