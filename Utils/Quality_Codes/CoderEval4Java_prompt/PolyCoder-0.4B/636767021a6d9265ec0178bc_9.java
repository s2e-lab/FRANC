import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#indexOf(String)}. 
	 */
	
	public static int indexOf(String str,String searchStr){
		 int len = 0;
			String result= str.toUpperCase();
			for(;result!=null;result=result.trim()){
			    if(!result.equals(str))
				if(searchStr!=null && result.equals(searchStr))
				{
				 		len = result.length();
				 		 return result.indexOf(searchStr);
				}
			     len++;
			}
			return -1;
	}
	
}