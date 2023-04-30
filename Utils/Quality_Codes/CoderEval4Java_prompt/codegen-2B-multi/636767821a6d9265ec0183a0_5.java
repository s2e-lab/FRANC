import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		File f = new File(fileName);
		if(f.exists()){
			f.delete();
		}
	}

	/**
	 * Checks whether a specified file exists in the given directory
	 * @param fileName
	 * @param rootParentDir
	 * @return
	 */
	protected static boolean fileExists(String fileName, String rootParentDir){
		File f = new File(rootParentDir + fileName);
		if(f.exists()){
			return true;
		}
		return false;
	
}
}