import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#indexOf(String)}. 
	 */
	
	public static int indexOf(String str,String searchStr){
		 try{
		int found=str.indexOf(searchStr);
		while(found>-1 && str.compare(found,searchStr)==0){
			found=str.lastIndexOf(searchStr);
		}
		return found;
		}
		catch(Exception e){
			return 0;
		}
	}
	
	
	/** 
	 * Finds the first index within a string, handling <code>null</code>. This method uses  {@link String#lastIndexOf}. 
	 */
	
}