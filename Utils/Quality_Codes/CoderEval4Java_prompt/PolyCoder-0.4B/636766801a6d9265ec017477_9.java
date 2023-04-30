import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
		 for(final InputStream file : files){ 
			 file.toFile().delete();
		 }
	}
	
	
	/**
	 * Add the specified files in reversed order.
	 */
	private void addReversed(final InputStream[] files){
		for(final InputStream file : files){ 
			file.toFile().renameTo(new File(file.toFile().getPath()));
		}
	}
	
	
	/**
	 * Copy the input stream so that no input is read before it is moved.
	 */
	public String readString(){

}
}