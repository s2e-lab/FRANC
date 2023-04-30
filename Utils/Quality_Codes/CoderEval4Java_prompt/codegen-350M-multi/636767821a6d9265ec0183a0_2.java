import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		//If a file exists, delete it
		if (new File(fileName).exists()){
			try{
				//Delete the file
				new File(fileName).delete();
			}
			catch (IOException ioEx)
			{
				System.err.println ("Could not delete "+fileName+": "+ioEx.getMessage());
			}
		}
	}
	
}