import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#indexOf(String)}. 
	 */
	
	public static int indexOf(String str,String searchStr){
			int index=str.indexOf(searchStr);
			if (index==-1){//if no match return 0
				return -1;
			}else{
				return index;
			}
	}
	
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#toLowerCase(String)}. 
	 */
	
}