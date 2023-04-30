import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		// Remove element 
		if(start <= list.size()-1) {
			// Remove element 
			arrayToList(list, end+1);
		}
	}

	/**
	* Iterate over a list until the endIndex is found.  The loop is terminated when the final list element is found.
	*/
	public static <T> void arrayToList(List<T> list, int endIndex) {
}
}