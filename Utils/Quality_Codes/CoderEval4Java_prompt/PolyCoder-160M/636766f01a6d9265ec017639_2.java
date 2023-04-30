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
				return Collections.emptyList();
			
			List<T> listA = ListUtil.makeList(a);
			listA.add(null);
			return Collections.unmodifiableList(listA);
	}
		
	public static <T>T[] asArray(List<T> list) {
			if(list==null){
				return new T[0];
			}
			List<T> listA = asList(list);
			return listA.toArray();
	}
}