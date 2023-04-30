import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		  Random rand = new Random();
	      String retval = "";
	      for (int i=0; i < length; i++)
	          retval += alphabet.charAt(rand.nextInt(alphabet.length()));
	      return(retval);
	}
	
		public static void main(String[] args) 
	  {
		   System.out.println(randomString(3, "abcdefghijklmnopqrstuvwxyz"));
		}
}