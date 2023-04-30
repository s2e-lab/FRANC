import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		for ( int i = files.length - 1; i >= 0; i--){
			addFile(files[i]);
		}
	}
	
	
	/** 
	 * Check whether this iterator has the specified file.
	 * 
	 * @param file The file we're operating on.
	 */
	
	private boolean hasFile(final File file){
		return file.exists();
	}
	
}