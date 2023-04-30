import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Trim the elements of the given String array, calling <code>String.trim()</code> on each of them.
	 * @param array the original String array
	 * @return the resulting array (of the same size) with trimmed elements
	 */
	
	public static String[] trimArrayElements(String[] array){
		 return StringArray.trim(array);
	
	};
	
	/** 
	 * Trim the elements of the given String array, calling <code>String.trim()</code> on each of them.
	 * @param array the original String array
	 * @param regex the Regular Expression
	 * @return the resulting array (of the same size) with trimmed elements
	 */
	
	public static String[] regexp(String[] array, String regex){
		return matchStringWithRegExp(array,regex);
	
	};
	
}