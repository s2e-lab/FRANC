import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
		 
	    StringBuffer buffy= new StringBuffer();    
		for(String str : coll){
			buffy.append(str);
			buffy.append(", ");				
		}
		return buffy.toString().replaceAll("and", "and").replaceAll(" and, \"\" ", " and ");
	}
	
	
	/**
	* Turn a collection of Strings into a single String
	*/
	public static String arrayToArrayString(String[] array){
		StringBuffer resultString = new StringBuffer();
}
}