import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
			//initialize our ZipFile object
			ZipFile input= new ZipFile(sourceFilename);
			//initialize an input stream
			ZipInputStream src=input.getInputStream(zipName);
			ZipInputStream srcDest=null;
			//open destination
}
}