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
		 return new ArrayList<>(a);
	}
	
	/** 
	 * String to String. <p>
	 * Returns a string representation of {@link Object.class} with all the fields set to their default value. 
	 * @return a string. 
	 */
	
	public static <K, V> String stringify(Object o){
		StringBuilder sb = new StringBuilder();
}
}