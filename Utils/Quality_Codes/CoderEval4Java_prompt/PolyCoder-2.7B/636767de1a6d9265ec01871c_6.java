import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		 
		if(value == null || value.intValue() == 0) return; 
		Integer newValue = (Integer)value.intValue();
		Integer oldValue = (Integer)super.element(key);
		
		if(oldValue.intValue() <= newValue) return;	
				
		super.element(key).value += newValue;
			
	}
	public void valueAccuracation(String key,Long value){
		Integer newValue = (Integer)value.intValue();
		Integer oldValue = (Integer)super.element(key);
		
		
}
}