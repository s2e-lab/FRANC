import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		InputStream in = null;
		OutputStream out = null;
		try{
			//Open the source file
			in = new FileInputStream(sourcePath);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		//Create the destination file
		try{
			out = new FileOutputStream(destPath);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		//Write the contents of the file to the destination file
}
}