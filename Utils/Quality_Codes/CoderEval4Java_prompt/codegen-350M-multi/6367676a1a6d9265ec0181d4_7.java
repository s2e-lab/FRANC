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
		String[] result=new String[array!=null?array.length+1:1];
		System.arraycopy(array,0,result,0,array!= null? array.length:0);
		result[result.length-1]=str;
		return result;
	}

}