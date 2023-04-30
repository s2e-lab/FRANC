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
			File file = new File(fileName);
			if(file.exists()){
				file.delete();
			}
		}catch(Exception e){
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	protected static void copyFile(String src, String dest){
}
}