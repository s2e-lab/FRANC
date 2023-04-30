import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		long accumulator = 0;
		for(int i = 0; i < length(); i++){
			if(getString(i).equals(key)){
				accumulator += getLong(i);
			}
		}
		put(key, value + accumulator);
	}
}