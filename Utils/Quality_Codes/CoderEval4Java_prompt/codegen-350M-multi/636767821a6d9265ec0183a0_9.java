import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		File aFile = new File(fileName);
		if(!aFile.exists()){
			return;
		}
		File aDeletedFile = new File(fileName);
		//aDeletedFile.delete();		 //deleted the file no need to rename and recreate the file
		FileUtil.rename( aDeletedFile, aFile.toURI().toString()); //do not delete nor rename
	}
	
	
	protected static void runMainLoop(int totalRuns, int iterations, long sleepTime){
}
}