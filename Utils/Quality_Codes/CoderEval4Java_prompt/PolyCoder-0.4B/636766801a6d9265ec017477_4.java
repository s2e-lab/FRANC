import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
			if(files.length!=0){
				add(files,0, files.length);
			}
	}
	
	private void add(final InputStream[] files,int startOffset, int fileLength){
			if(startOffset<0 || startOffset>files.length){
				throw new RuntimeException("Cannot create input stream");
			}
			if(fileLength<0 || startOffset+fileLength>files.length){
				throw new RuntimeException("Cannot create input stream");
			}
}
}