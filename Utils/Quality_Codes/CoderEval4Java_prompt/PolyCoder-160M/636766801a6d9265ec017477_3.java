import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
		 
	for(InputStream i: files){
		 
		 i.getParent().add(i);
		}
	}
	
	/** 
	 * Closes the input iterator.
	 */
	public void close(){
		try {
			close();
		} catch (IOException e) {}
	}
	
	/**
	 * Closes the input iterator.
	 */
	private void close(){
}
}