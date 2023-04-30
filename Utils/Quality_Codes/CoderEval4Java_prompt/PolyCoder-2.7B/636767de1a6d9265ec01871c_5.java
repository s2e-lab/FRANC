import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		 this.valueMap.set(key,value);
		 setTouched(key,true);
		}
	
	
   /** 
    * Adds a list to the end of another list.
    */
   public LongValue addAllToThis(ListValue list){
      for( LongValue l : this ) {
   	 list.addToList(l);
   	 }
     return this;
   }
   


}