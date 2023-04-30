import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		return str.containsAny(searchStrArray);
	}
	
	/**
     * This function gets the string that is passed as input(argb3_d4) and returns the respective byte array of same
     * @param key
     * @param data 
	 */
	
	public static void main(String[] args) throws IOException{		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string : ");		
		String st=br.readLine();
}
}