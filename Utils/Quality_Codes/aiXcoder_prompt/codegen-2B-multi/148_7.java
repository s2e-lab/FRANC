import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		for(int k=0; k<list.size(); k++)
			if(i == k){
				swap(list, j, k);
				return;
			}else if(k == j){
				swap(list, i, k);
				return;
			}
		Object temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

    // Encapsulates the answer in a pair: the first object is the amount of swaps to be made to
}