import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		File theFile = new File(fileName);
		if(theFile.exists() && theFile.isFile() && theFile.canRead()){
			System.out.println(java.lang.System.currentTimeMillis() + " File: " + fileName + " deleted");
			theFile.delete();
		} else{

		}
		System.out.println(java.lang.System.currentTimeMillis() + " File: " + fileName + " deleted");
	}
}