import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		long[] tmp = arr.get(key);
		// The first value added.
		if(tmp==null){
			arr.put(key,new long[]{value});
			return;
		}
		
		// Otherwise, compare with first value added.
}
}