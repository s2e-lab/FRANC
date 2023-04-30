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
			File tmpFile = new File(fileName);			
			tmpFile.delete();
			tmpFile.delete();
		 }catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/** 
	 * Create or overwrite the file with the specified contents 
	 */
	protected static String add(String contents,String fileName){
			
		String oldContents = "";
		File tmpFile = new File(fileName);			
}
}