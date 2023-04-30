import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		List<E> sublist = new ArrayList(list);
		int temp;
		E tempE;
		E element1;
		E element2;
		if(i > j){
			i += 1;
			j -= 1;
		}
		temp = list.get(j);
		sublist.set(j, list.get(i));
		list.set(i, temp);
		sublist.set(j, list.get(i));		
		element1 = sublist.get(i+1);
}
}