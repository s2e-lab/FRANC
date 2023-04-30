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
			//if file doesn't exist, return 
			if(!file.exists()){
				throw new IOException("File " + file.getAbsoluteFile() + " doesn't exist!");
			}else{
				return;// if file exists, delete it
			}
	}
	
	public static void main(String[] args) throws IOException{
		String fileName = args[0];
		String fileKey = fileName + ".csv";
		PrintWriter pw = new PrintWriter(fileName);
}
}