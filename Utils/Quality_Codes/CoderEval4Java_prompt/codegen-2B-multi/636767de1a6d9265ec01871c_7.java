import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		long v = map.getOrDefault(key,0L) + value;
		map.put(key,v);
		
		
		/* 
		 * 
		 */
		//sum += val;
	}
	
	TreeMap<String,Long> map;
}
