import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		swapRec(list, i, j, list.size());
	}

	private static <E> void swapRec(List<E> list, int i, int j, int n){
		if(i==j){
			return;
		}

		E temp = list.get(i); // keep it for future reference
		list.set(i, list.get(j));  // Swap.
		list.set(j, temp);
		swapRec(list, i+1, j, n);
	}
}