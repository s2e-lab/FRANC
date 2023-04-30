import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Append the given String to the given String array, returning a new array consisting of the input array contents plus the given String.
	 * @param array the array to append to (can be <code>null</code>)
	 * @param str the String to append
	 * @return the new array (never <code>null</code>)
	 */
	
	public static String[] addStringToArray(String[] array,String str){
		
		if(array==null){//null check allows overriding this
			array = new String[1];
			array[0] = str;
			return array;
		}
		
		if(array.length<1){//null check allows overriding this
			array = new String[array.length+1];
		}
		
		if(array[array.length-1]==null){//null check allows overriding this
			array[array.length-1] = str;
		}
		
		return array;
	}
	
}