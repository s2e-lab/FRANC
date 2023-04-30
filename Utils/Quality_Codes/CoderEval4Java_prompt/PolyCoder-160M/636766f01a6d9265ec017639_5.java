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
			return a == null? new ArrayList<T>(null) : Arrays.asList(a);
	}
	
	public static <T>List<T> asList(T[] a,T... b){
		return asList(a,0,b).iterator();
	}
	public static <T>List<T> asList(T[] a,int b){
		if(a == null){
			return Collections.emptyList();
		}
		int x = a.length;
}
}