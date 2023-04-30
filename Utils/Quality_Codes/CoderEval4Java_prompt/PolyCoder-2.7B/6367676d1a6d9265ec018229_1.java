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
			String[] newArray = new String[Arrays.asList(array).length];
			int index = 0;
			for(String element : array){
				if(element.length() > 0){
					String newElement = element.split("#").iterator().next();
					newArray[index++] = newElement;
					newArray[index++] = "#";
				}
			}
			return newArray;
	}
}