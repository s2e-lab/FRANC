import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		for(int i=start+1; i < end; i++) {
			list.set(i, null);
		}
		
		return;
	}

/**
* Delete data of object List until end index
* (end inclusive).
* @param list : start - index of an object List 
* @param end : start - index of an object List 
*/ 
protected static void delete(java.util.List<java.lang.Integer> list, int start, int end) {
}
}