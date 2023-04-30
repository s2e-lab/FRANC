import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		try {
			if(!new File(fileName).exists()){
				return ;
			}
			PrintWriter pw; 
			try {
				pw = new PrintWriter(new FileWriter(fileName));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// Print the message
			pw.println("Deleting  the file " +fileName);
			pw.close();
			File f = new File (fileName);