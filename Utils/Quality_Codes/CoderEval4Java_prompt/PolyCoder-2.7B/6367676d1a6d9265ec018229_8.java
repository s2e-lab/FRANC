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
		 String[] result=new String[array.length];
		 for(int i=0; i<array.length;i++){
			 if(array[i].length()>0){
				 result[i]=trimChars(array[i],'');
			 }else{
				 result[i]=array[i];
			 }
		 }
		 return result;
	}
	

	/** Removes all leading and trailing whitespace from the given string */
	
	public static String trim(String s){
		int sLength=s.length();
}
}