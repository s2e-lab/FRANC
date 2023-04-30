import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
			if( value > 0)
				map.put(key,value);
	}

	
	public void set(String[] val){
		for(int i=0;i<val.length;++i)
			if(!val[i].startsWith("--"))
				valueAccumulation(val[i],Long.parseLong(val[i].trim()));
		else
			valueAccumulation(val[i],0);	
	}
	
	@Override
	public String toString(){
}
}