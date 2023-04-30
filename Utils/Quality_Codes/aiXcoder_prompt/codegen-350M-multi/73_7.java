import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		for (int i = start; i <= end; i++){
			list.remove(i);
		}
	}

	/**
	* Insert data at start to a sorted oj object.
	*/
	public static <T> void insert(List<T> list, int start, int end, T elem) {
		list.remove(start);
		list.add(elem);
	}

}