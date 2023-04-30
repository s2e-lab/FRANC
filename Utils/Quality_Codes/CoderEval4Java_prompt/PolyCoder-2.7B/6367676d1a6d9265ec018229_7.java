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
		 if(array==null)
			 return null;
		 String  tmp = "";
		 int     len = array.length;
		 for(int i=0; i<len; i++){
			 tmp += (array[i].trim());
			 if(tmp.length() > 0)
				 return array;
		 }
		 return new String[0];
	}
	
}