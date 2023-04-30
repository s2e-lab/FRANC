import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
			int n=files.length;
			//System.out.println("addReverse");
			ArrayDeque<File>  q=new ArrayDeque<>();
			for (int i=n-1; i>=0; i--){
				q.push(files[i]);
			}
}
}