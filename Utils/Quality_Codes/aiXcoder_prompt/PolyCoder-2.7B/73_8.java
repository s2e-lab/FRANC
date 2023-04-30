import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		 if(Integer.compare(start, list.size())>=0 && start==end) {
			 if(!list.isEmpty()) {
				list.remove(start);
			 }
		 }
	}

	/**
	* Return the first index of any value in array.
	*/
	public static <T> int[] toArray(T[] array) {
		int size = array.length;
		int index = 0 ;
}
}