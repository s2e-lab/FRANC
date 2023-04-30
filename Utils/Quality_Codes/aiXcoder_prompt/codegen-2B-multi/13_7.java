import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		StringBuilder s = new StringBuilder();		
		
		Random random = new Random();
		for(int i=0; i<length; i++){
			int index = random.nextInt(alphabet.length());
			s.append(alphabet.substring(index, index+1));
		}				
		return s.toString();
	}
	
	/**
	* Returns a string consisting of chars from given strings from given strings number. 
	*/
	
}