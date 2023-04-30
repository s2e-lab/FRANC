import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		 try{
			 InputStream fi = Util.class.getClassLoader().getResourceAsStream(zipName);
			 InputStream jst = new FileInputStream(destPath);
			 // Create a BufferedReader and copy all files from its original InputStream
			 Random rnd = new Random();
			 CharBuffer chBuffer = new CharBuffer(40);
			 BufferedReader br = new BufferedReader(
				       new InputStreamReader(jst, Encoding.forName("UTF-8"), false));
			 // Read the first file's UTF-8 length.
			 int nCharInFile = 0;
			 int nChar