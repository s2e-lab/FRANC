import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		if(fileName == null)
			return;

		File file = new File(fileName);
    	
		if(file.isFile() && file.exists()){
			file.delete();
		}
	}

	/**
	 * Delete's the specified file. Creates a new file if necessary.
	 * 
	 * @param name the name of the file
	 */
	
	protected static void appendFile(String name, BigInteger message){
		if(name == null)
			return;
	
}
}