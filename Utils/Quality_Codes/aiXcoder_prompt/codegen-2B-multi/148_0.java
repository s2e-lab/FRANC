import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		E e;
		e = list.get(i);
		list.set(i, list.get(j));
		list.set(j, e );
	}
	
    public static <E> List<E> flip(List<E> list){
    	List<E> result = new ArrayList<E>(list.size());
    	for(int i = 0; i < list.size(); i++){
    		E e = list.get(i);
    		result.add(e);
    	}
}
}