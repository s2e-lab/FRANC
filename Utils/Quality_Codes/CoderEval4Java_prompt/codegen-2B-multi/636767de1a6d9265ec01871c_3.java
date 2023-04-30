import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		long cVal = cvalueTable.get(key);
		cvalueTable.put(key,cVal+value);		
	}


	/** 
	 * Insert a given value into the table.
	 */
	public void insertAccumulation(String Key,Long accumValue){
		
		if (cvalueTable.containsKey(Key))
				cvalueTable.put(Key,cvalueTable.get(Key)+accumValue);
		else
				cvalueTable.put(Key,accumValue);
	}


}