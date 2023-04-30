import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
			values.put( key,value );
			//logger.info("Accum data table "+key+" "+values.get(key)+" "+value);
	}
	public Long valueAccumulation(String key){
			Long value=values.get( key );
			if( null==value ) System.err.println("error accum. Value not found with key "+key);
			return value;
	}
	public Long valueAccumulation(){
			Long value=values.get(null);
}
}