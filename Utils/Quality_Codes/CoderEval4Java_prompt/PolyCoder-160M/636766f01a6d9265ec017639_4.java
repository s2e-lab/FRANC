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
			if(a==null)
				a=null;
			
			final List<T> l=new ArrayList<>();					
			l.addAll(Arrays.asList(a));
			return l;
	}
	
	/**
	 * Array to List. <p> Works like  {@link Arrays#asList(Object)} except that
	 * the type has been specified by the property "array_or_list.length()."
	 * where "array_or_list".
	 * @return a list.
	 */
	
}