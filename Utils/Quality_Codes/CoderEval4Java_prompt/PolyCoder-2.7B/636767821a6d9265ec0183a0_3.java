import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		
/* We need two copies of this before deleting it. Do a quick and dirty
 * copy instead. Note that the Java 5 compiler warns if files named
 * "newFiles" or "oldFiles" are both empty.
 *
 * In the next version we should use java5 style file deletion
 */
		String newFileName = fileName.replace("_-", "-").replace(".txt","");
		String oldFileName = fileName.replace("_-", "-").replace(".txt",".old");
		File newFile = new File(fileName);
}
}