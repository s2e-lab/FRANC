import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
			for (int i=start; list.size()>start && i<end; i++) 	{
				if (list.get(i)==null)	list.add(i, null);
			}
	}
	public static <T>void delete(T[] arr, int start, int len) {
		for (int i=start; i<start+len; i++)	{
			if (arr[i]!=null) {}
		}
}
}