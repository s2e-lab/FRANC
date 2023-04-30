import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
		
//		List<String> list = new LinkedList<String>(item);
		List<String> list = new LinkedList<String>(Arrays.asList(item));
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		});

		int count = 0;
}
}