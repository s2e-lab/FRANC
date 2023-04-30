import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		String returnString = "";
		for (int i = 0; i < length; i++){
			int random_position = ((int)(Math.random() * alphabet.length()))+1;
			returnString += alphabet.substring(random_position,random_position+1);
		}
		return returnString;				
	}

	/**
	* Checks, whether a string ends with prefix or not.
	*/
    public static boolean endsWith(String string, String prefix){
        return string.endsWith(prefix);
    }


    
}