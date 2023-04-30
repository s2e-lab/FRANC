import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		final StringBuffer buffer = new StringBuffer();
		FileIterator current = null;
		File currentFile = null;
		int newPos;
		String currentFileName;
		
		try{
			Arrays.sort(files);
		}catch(IllegalArgumentException e){
			//
			System.err.println(files);	
		}
		
}
}