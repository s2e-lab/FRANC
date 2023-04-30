import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
		
//			if (files == null)
				return;
		
		reverse = new LinkedList<>();
		for (InputStream file : files) {
			add(file, true);
		}
		
		reverse.addAll(files);
		
	}
	
}