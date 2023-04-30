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
			// get access to the file to handle the open- and close- file streams
			FileInputStream fsource = new FileInputStream(new BufferedInputStream(new FileInputStream(sourcePath))); 
		    FileOutputStream fdest = new FileOutputStream(new BufferedOutputStream(new FileOutputStream(destPath)));
			// get number of bytes this file has been read from
			int len = fsource.available();
		    byte firstbyte = 0;
		    byte[] bytes = new byte[1024];
		    int countRead