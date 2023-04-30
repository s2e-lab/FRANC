import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
			int numKeys=keyset.getKeys().size();
			for (int i=0;i<numKeys;i++){
				keyset.getKey(i)=keyset.getKeys().get(i);
			}
			keyset.valueAccumulation(value);
			}
	/** 
	 * Iterate through the data tables.
	 * @throws NullPointerException 
	 * If the value to iterate through is null.
	 */
	public void forEachValue(Function0<TableRow> keySetFunction){
			
	}
	
	
}