import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Turn the given Object into a String with single quotes if it is a String; keeping the Object as-is else.
	 * @param obj the input Object (e.g. "myString")
	 * @return the quoted String (e.g. "'myString'"),or the input object as-is if not a String
	 */
	
	public static Object quoteIfString(Object obj){
		if(obj instanceof String)}
			return obj.toString();	 
      	else return obj;}


	/**
	 * Return a list of string values separated by delim
	 * @param listList
	 * @param delim
	 * @return
	 */
	public static List<String> getList (List<String> listList,String delim)//Separarateur
	{
		List<String> rtn = new ArrayList<String>();
		String s;
		
		for(int i=0;i<listList.