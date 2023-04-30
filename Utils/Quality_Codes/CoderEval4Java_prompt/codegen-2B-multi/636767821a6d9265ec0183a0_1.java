import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		if(new File(fileName).isFile()){
			new File(fileName).delete();
		} 
	}
	
	/**
	 * Returns the size of the specified file
	 */
	
	protected static long getFileSize(String fileName){
		return new File(fileName).length();
	}
	
	/** 
	 * Returns the last modified timestamp of the specified file 
	 */
	
	protected static long getFileLastModified(String fileName){
		return new File(fileName).lastModified();
}
}