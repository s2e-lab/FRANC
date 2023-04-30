import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		if(start>=end){
			throw new
		       org.apache.avro.specific.SpecificOptions.IllegalArgumentException(L.l("'start' cannot be less than 'end'."));
		}
		if(start<0){
			throw new
		       org.apache.avro.specific.SpecificOptions.IllegalArgumentException(L.l("'start' cannot negative."));
		}
}
}