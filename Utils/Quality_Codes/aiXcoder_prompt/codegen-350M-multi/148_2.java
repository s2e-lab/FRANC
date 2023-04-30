import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	/**
	* Determines whether the specified int is a substring of the specified 
string. Returns true if the both strings are the same, or if the 
sorted sequences contain the specified item; otherwise 
returns false.
	*/
	public static <E> boolean contains(E[] array, E needle, E[] haystack, int i, int j){
		int a=i;
}
}