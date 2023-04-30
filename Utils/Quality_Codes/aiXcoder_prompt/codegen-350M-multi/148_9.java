import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		E tTemp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, tTemp);
	}
	
	public static <E> void sort(List<E> list, int i, int j){	
		E tTemp, tTemp2;
		int cmp;
		cmp = list.get(i).compareTo(list.get(j));
	
		tTemp = list.get(i);
		list.set(i, list.get(j));
		
}
}