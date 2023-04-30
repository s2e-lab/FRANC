import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ReflectionToStringBuilder{
	/** 
	 * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists (arrays and collections). Note that  {@link Arrays#sort(Object[])} will throw an {@link NullPointerException}if an array element is <code>null</code>.
	 * @param array The array to check
	 * @return The given array or a new array without null.
	 */
	
	static String[] toNoNullStringArray(Object[] array){
		String[] strings = null;
		
		if(array!= null){	
			String s = arrays2String(array);
			strings = new String[array.length - 1];	
			for(int i = 0;i < array.length - 1;i ++){
				strings[i] = s;
			}			
		} 
		return strings;		
	}
	
}