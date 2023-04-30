import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		
		File file = new File(fileName);
		
		if(!file.exists()) 	return;
		
		if(file.isDirectory()){
			String[] children = file.list();
			for(int i = 0; i < children.length; i++){
				deleteFile(fileName+"/"+children[i]);
			}
			file.delete();
		}else{
			file.delete();
		}
	}
	
	/** Prints out a message and exits with a success message */
}