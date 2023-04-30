import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		Random R = new Random();
		String out = "";
		for(int i = 0; i< length; i++){
			out+=alphabet.charAt(R.nextInt(alphabet.length()));
		}
		return out;
	}
}

