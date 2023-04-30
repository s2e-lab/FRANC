import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
			if(files == null){
				reverse = new ReversedIterator(FileChannel.open(FileChannel.PATH_TO_LIST_DIRECTORY_1 + FileChannel.FORMAT_NAME));
			}else{
				reverse.put(files);							
			}	
	}
	
	//This implementation only works if the iterator also contains the files
	private boolean next()
	{
}
}