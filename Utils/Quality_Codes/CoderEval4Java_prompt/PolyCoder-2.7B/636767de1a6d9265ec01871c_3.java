import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
			for (int i=0; i < keys.length; i++){
				if (value.equals(keys[i])) {
					keys[i]++;
					return;
				}
			}
		//
		keys[keys.length]=value;
		keys[keys.length-1]=1;
	}
}