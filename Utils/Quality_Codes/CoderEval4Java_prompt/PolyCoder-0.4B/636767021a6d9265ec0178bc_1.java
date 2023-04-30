import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#indexOf(String)}. 
	 */
	
	public static int indexOf(String str,String searchStr){
		 return(str.indexOf(searchStr)||-1);
	}

	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  
	 * {@link String#indexOf(int, int)}. The substring start at zero, is ignored. If more than one such index is found, then all matching String indices are included in the result. 
	 */
	
	public static String firstIndexOf(String str,String searchStr){
	    
}
}