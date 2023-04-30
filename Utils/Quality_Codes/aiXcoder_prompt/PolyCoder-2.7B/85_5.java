import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str==null && trailing==null){return null;}
			if(str==null){return "";}
			if(trailing==null || trailing.length()==0){return str; }
			return str+trailing;
	}
	
	/**
	* This takes a line of text, and creates words from them. The length of each word is determined by the number of characters
	* The string passed in is assumed to already have been preseved through all the words
	*/
	public static ArrayList<String> getWords(String text){
		
}
}