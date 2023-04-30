import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
			new ArrayList<T>(list).delete(start,end);
	}
	/**
	* Delete data from start until end index (end inclusive) of a 
	* non-empty list.
	*/
	public static <T> void delete2(ArrayList<T> list, int start, int end) {
			for (int i = start; i < end; i++){
				list.remove(i);
			}
	 }
	/**
	* Delete data until a given index (end inclusive) from an array.
	*/
	
}