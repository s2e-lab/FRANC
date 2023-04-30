import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		if(existingTable.containsKey(key)){
			Long accumulValue = existingTable.get(key);
			existingTable.put(key,accumulValue+value);
		}
		else{
			existingTable.put(key,value);
		}
	}
	
	/** 
	 * Return the map of table that are actually used as the data table. 
	 */
	public Map<String,Long> getAccurateTable(){
		return this.existingTable;
	}
	
}