import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TypeUtil{
	/** 
	 * Array to List. <p> Works like  {@link Arrays#asList(Object)}, but handles null arrays.
	 * @return a list backed by the array.
	 */
	
	public static <T>List<T> asList(T[] a){
		 try {
			return Arrays.asList(a);
		    } catch (NullPointerException e) {
		    	return Arrays.asList().isEmpty()? new ArrayList() 
				: Arrays.asList(null, (Object) a[0]);
			} catch (Exception e) {
				return new ArrayList(Arrays.asList(a));
		    	}
	   	
	   }
	
	  
	  
}