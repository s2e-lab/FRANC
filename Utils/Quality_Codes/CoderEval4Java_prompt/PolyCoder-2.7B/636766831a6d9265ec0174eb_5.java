import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		 int size = files.length;
		 if (size == 0)
			return ;
	
		 File[] sorted = new File[size];
		 sorted[0] = files[size-1];
		 
		 for (int i = 1; i < size; i++){
			sort(files[i].getParentFile());
			sorted[i] = files[i];
		 }
	
		 ArrayList tmpList = new ArrayList();
		 
}
}