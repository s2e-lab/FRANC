import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
			String valueS = Long.toBinaryString(value);
			if(valueS == null || valueS.length() == 0)
				valueS+= "null";
			try{
				writeRecord(key,valueS);
			}catch(IOException e){
				e.printStackTrace();
			}

	}
	
	
	/**
	 * Write the given key to the disk, which should be an array
	 * of string values. The value passed in is overwritten.
	 */
	
}