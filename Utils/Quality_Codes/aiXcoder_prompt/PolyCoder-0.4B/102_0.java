import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID102{
	/**
	* Returns the current number of entries in the map.
	*/
	public static int size(Map<String, String> map){
		 int count;
	     count = 0;
		    for (String key : map.keySet()) {
//	         if(!key.equals(""))
		       throw new IllegalArgumentException(key + " is not a valid key value");
		     count += map.get(key).length();
	     }
	     return count;
	}
	
	/**
	* Returns the current number of entries in the map.
	*/
}