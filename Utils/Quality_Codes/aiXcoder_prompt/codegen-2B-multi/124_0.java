import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
		list.add(item);
	}

	/**
	* Removes the item at the specified position in the list.
	*/
	public String delete (List<String> list, int index){
		String out = null;
		int i = 0;
		while (i < list.size () &&
			(index-i) >= 0 && (index-i) < list.size() &&
			list.get(index-i).compareTo("null")!= 0) {
		  i++;
		}		
}
}