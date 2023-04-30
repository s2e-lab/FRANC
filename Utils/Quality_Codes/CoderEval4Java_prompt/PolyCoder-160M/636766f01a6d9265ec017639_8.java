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
		 
		try  {
		return new ArrayList<>(a);
		}catch (Exception e){
			Debug.out(e);
		}
		}
	
	public static <T> List<T> asList(T[] a){
		 
			try  {
			return new ArrayList<>(a);
		}catch(Exception e){
			return Collections.unmodifiableList(asList(a));
		}
		}
	
}