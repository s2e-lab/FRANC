import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		Object temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	/**
	* Returns a list of shuffled index pair
	*/
	public static <E> void shuffle(List<E> list,RandomizedContext<E> rc){
}
}