import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#indexOf(String)}. 
	 */
	
	public static int indexOf(String str,String searchStr){
		 try {
			
								  return str.indexOf( searchStr );	
				
		} catch( Exception e ){ 
			if(logger.isErrorEnabled()){
					logger.error("Could not determine index " + str + " in " + searchStr + " because " + e.toString(),e);
				}	
			return -1;
	}
}

}