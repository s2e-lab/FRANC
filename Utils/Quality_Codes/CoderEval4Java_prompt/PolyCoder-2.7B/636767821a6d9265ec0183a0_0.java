import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		 
		 //if file doesn't already exist....
		 
		 File file = new File(fileName);
		 if(!file.exists()){
			 System.out.println("No file: " + fileName);
			 return;
		 }
		 
		 //deletes the files (by removing all the other content) and finally delete it
		 
		 //if it's a folder, first delete all the children
		 File[] files = file.listFiles();
}
}