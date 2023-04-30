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
		return array == null? new String[]{str} : array;
	}
	/** 
	 * Delete all occurances of the given String in the given String array, and return it.
	 * @param array the String array to delete the String from
	 * @param str the String to search for
	 * @return the deleted String array (never <code>null</code>)
	 */
	
	public static String[] deleteStringFromArray(String[] array, String str){
		if(array == null){
			return new String[0];
		}

}
}