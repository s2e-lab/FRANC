import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		for(File file : files){
			String fileName = file.isFile()? file.getName() : null;
			
			if(fileName!= null){
				ReverseFileIterator reverseFileIterator = 
					new ReverseFileIterator(fileName);
				doNext(reverseFileIterator);
			}
			else{
				FileIterator reverseFileIterator = 
					new FileIterator(file);
				doNext(reverseFileIterator);
			}
		}
	}
	
	private void doNext(FileIterator fileIterator){
}
}