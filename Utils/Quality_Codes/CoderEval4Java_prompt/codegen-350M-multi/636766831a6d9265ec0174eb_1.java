import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		final File[] reverseFiles = new File[files.length];
		for (int i = 0; i < reverseFiles.length; i++)
			reverseFiles[i] = files[files.length - i -1];
		add(reverseFiles);
	}
	
	/** 
	 * Add the specified files in forward order.
	 */
	
	private void add(final File[] files){
		for (int i = files.length -1; i >=0 ; i--){
			add(files[i]);
		}
	}
	
}