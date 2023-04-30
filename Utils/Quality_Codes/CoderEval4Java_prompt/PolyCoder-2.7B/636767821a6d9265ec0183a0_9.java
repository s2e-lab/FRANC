import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		 try{
			File file = new File(fileName);
			if(file.exists()){
				file.delete();
			}
			else{
				throw new RuntimeException("File "+fileName+" does not exist!!");
			}
		} 
		catch(InterruptedException ex){
			throw new RuntimeException(ex);
		}
	}
	
	
	/**
	 * This method runs recursively to perform the append to the file.
	 */
	public static void append(File targetFile){
}
}