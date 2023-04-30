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
		if ( (array!= null) && (array.length!= 0) 
				&& (str!= null) &&! str.equals("") ){
			String[] newarray = new String[array.length + 1];
			int i = 0;
			for(;i < array.length; i++){
				newarray[i] = array[i];
			}
			newarray[i] = str;
			return newarray;
		} else {
			return new String[0];
		}
	}
}