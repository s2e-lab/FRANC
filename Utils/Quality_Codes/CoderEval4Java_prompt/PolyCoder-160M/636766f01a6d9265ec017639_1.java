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
		 ArrayUtil.checkLen(a, 2);
		 return (List<T>) a[0];
	}
	
	public static <T>List<T> toList(T[] array){
		 ArrayUtil.checkLen(array, 1);
				
		 return (List<T>) new ArrayList<T>(array);
	}
	
	
	public static <T>List<T> toList(List<T> list){
		Arrays.asList(array) = asList(list);
		return list;
	}
	
}