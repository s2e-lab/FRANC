import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		StringBuilder sb = new StringBuilder();
		
		Random rnd = new Random();
		for (int i = 0; i < length; i++){
			sb.append(alphabet.charAt(rnd.nextInt(alphabet.length())));
		}
		
		return sb.toString();
	}
	
    public static void main(String[] args) throws IOException{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
}
}