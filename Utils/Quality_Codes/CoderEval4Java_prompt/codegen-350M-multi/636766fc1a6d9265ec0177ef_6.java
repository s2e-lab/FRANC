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
		int index=0;
		StringBuilder returnArray=new StringBuilder();
		for(int i=0; i<array.length; i++){
			if(array[i]==null){
				array[i]=new String("null");
			}else{
				returnArray.append(array[i]);
			}
		}
		return returnArray.toString().split(System.getProperty("line.separator"));
	}
	
}