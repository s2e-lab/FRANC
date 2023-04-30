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
			if(index==-1){
				return -1;
			}else{
				return index;
			}
	}
	/**
	 * Checks if the String has at least one character <code>character</code>.
	 */
	
	public boolean has(String str, int character) {
				
}
}