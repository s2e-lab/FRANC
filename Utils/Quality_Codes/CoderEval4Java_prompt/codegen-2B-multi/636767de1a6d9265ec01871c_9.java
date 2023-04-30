import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		Map m=this.data;
		Map<String,Long> map=this.data;
		Long sum=map.get(key);
		map.put(key,sum+value);
	}

	/** 
	 * Print the content of data to stdout.
	 *  
	 */

    public void print(){
    	PrintStream out=System.out;
        out.println();
        out.println("-----------------------------------");
        out.println("|  Key    |  Value  |");
        out.println("-----------------------------------");

}
}