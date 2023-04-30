import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
			if(object == null){  //if object is null
				return null; //return null
			}
			else{ 
				return object.toString(); //else return object's string representation
			}
		}
}
