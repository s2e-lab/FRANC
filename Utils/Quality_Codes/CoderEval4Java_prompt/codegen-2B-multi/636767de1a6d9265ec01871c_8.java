import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		if (!this.keySet.containsKey(key)){
			this.keySet.put(key, value);
			this.values.add(value);
		} 
		else {
			Long existingValue = this.keySet.get(key);	
			
			this.keySet.put(key, value+existingValue);
			this.values.add(value+existingValue);
		}				
	} 
}