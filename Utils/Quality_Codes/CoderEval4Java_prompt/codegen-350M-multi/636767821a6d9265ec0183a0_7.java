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
			BufferedReader inString = new BufferedReader(new FileReader(new File(fileName)));
			int lineNumber = 0;
			String line = inString.readLine();
			while(line!= null)
			{
				lineNumber++;
				System.out.println(lineNumber + " : " + line); 
				line = inString.readLine();
			}
			System.out.println("The file is deleted.");
			inString.close();
		} catch (IOException e) {
			e.print