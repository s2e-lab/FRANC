import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		if(fileName.equalsIgnoreCase("")){return;}

		File path = new File(fileName);
		try{
			if (path.exists()) {
				path.delete();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Method which creates the new log files
	 */
	
	protected static void logFileSetup(String log, boolean bDirection, boolean bAppend){
}
}