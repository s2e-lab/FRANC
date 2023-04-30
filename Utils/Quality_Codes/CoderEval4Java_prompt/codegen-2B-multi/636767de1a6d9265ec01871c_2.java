import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		accumulatedValue.put(key,value);
	}
	
	public long getValueForKey(String key){		
		return accumulatedValue.get(key);
	}
	
	// Accumulate the value.
	void accumulatedNumber(Long l){	
		accumulatedValue.put(l.toString(), l);
	}
	
	public void accumulatedNumber(double d){	
		accumulatedValue.put(d+"", Long.parseLong("0"));
	}


}