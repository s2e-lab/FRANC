import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		E ei = list.get(i);
		list.set(i, list.get(j));
		list.set(j, ei);
	}
	/**
	* Swaps the elements at the last position in the specified list.
	*/
	public static <E> void swap(ArrayList<E> list, int i){
		E ei = list.get(i);
		list.set(i, list.get(list.size()-1));
		list.set(list.size()-1, ei);

}
}