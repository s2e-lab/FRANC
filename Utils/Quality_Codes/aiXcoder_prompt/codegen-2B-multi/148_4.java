import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		List<E> copy_copy = new ArrayList<E>();
		for(int i2=i;i2<i+2;i2++)
		{
			copy_copy.addAll(list.subList(i,i2));
		}
		copy_copy.addAll(list.subList(i+2,i+9));
		copy_copy.addAll(list.subList(i+4,i+2));
		copy_copy.addAll(list.subList(i+6,i));
}
}