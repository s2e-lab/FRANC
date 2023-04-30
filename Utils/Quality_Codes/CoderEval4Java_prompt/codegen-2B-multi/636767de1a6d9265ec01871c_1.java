import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		if(map.get(key)==null){
			map.put(key,value);
		}
		else
			map.put(key,map.get(key)+value);
		
	}
	
	
	/** 
	 * Return the value of the key if exists; if not, return 0.
	 */
	
	private long getValueIfExists(String key){
		if(map.get(key)==null)
			return 0;
		else
			return map.get(key);
	}
	

}