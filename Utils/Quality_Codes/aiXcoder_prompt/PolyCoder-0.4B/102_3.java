import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID102{
	/**
	* Returns the current number of entries in the map.
	*/
	public static int size(Map<String, String> map){
			return size(list(list(map)));
	}
	/**
	* Returns the current number of entries in the map.
	* The map contains the key and entry as its values.
	*/
	public static int size(List<Map<String,String>> lists){
	    int size=0;
	    for (Map<String,String> e : lists){
	        size+=e.size();
	    }
	    return size;
	}
        
  
}