import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		try{
			// create a new BufferedReader for reading from a file
			BufferedReader br = new BufferedReader(new FileReader(sourcePath));
			//  create a new PrintWriter to print to a file
			PrintWriter pw = new PrintWriter(new FileWriter(destPath));
			String str;
			// while there are still characters left in the reader
			while ((str = br.readLine())!= null) {
				// append the string to the file that is generated on the file system
				pw.println(str);
			}
