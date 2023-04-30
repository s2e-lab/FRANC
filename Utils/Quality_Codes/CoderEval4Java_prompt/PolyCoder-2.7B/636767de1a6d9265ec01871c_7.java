import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		
//		System.err.println("valueAccumulation: key="+key+" value="+value);
	       
	    Set<String> keySet2 = this.keySet;
        Set<Integer> valueSet3 = value.keySet();
        Set<String> keySet3 = value.keySet();
        Set<String> keySet = keySet2.stream().filter(keySet3::contains);
        
//   
}
}