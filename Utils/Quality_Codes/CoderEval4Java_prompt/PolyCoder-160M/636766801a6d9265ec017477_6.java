import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
			for (int i = 0; i < files.length; i++) {
				Files.linkTo(files[i], File.listFiles((Filename)files[i]));
			}
	}
	
	/**
	 * Return a new ArrayList of String items that represent the current file(s) and the specified suffixes.
	 */
	public List<String> getFiles(String suffixes ){
		
		//System.out.println("getFiles() for");
		//System.out.println("suffixes");
		
}
}