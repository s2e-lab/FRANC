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
			ArrayList<T> list = new ArrayList<>();
			for( T t : a){
				list.add(t);
			}
			return list;
  }
	
	
	public static <T>boolean isArray(T a){
}
}