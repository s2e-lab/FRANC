import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		File src= new File(sourcePath);
		File dest= new File(destPath);
		src.delete();
		dest.delete();
		//create file from scratch
		OutputStream outStream=null;
		try{
			outStream= new FileOutputStream(dest.getAbsolutePath());
		}catch(IOException e){
			System.err.println( "Error while processing"+dest.getAbsolutePath()+ ": "+ e);
			System.exit(77);
		}
		readFile(src,outStream);
	
}
}