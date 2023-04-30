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
			deleteFile(new File(fileName));
		}
		catch(Exception e){ 
			System.exit(0);
		}
	}
	
	protected static void deleteFile(File file){
		if(file.exists()){
			System.out.println("Removing "+file);
			file.delete();
		}
	}
	
	protected void createFile(String fileName){
}
}