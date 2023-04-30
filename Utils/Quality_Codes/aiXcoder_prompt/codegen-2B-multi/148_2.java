import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		ListNode<E> n=(ListNode<E>)list.get(i);
		list.add((E) n.next);
		(n.next.data=list.get(j));
		(n.next=(ListNode<E>)list.get(j).next);
		(list.get(j).next = n.next);
		list.set(i, (E) n.next);
		list.set(j, (E) n);
	}//End swap

	//Main function
}