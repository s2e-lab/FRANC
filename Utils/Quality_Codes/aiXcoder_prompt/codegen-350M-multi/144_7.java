import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		System.out.println("Extracting "+zipName+" to "+destPath);
		File zip = new File(zipName);
		System.out.println("File "+zipName+" is "+zip.getName());
	    if(!zip.exists())
	        throw new RuntimeException(zipName+" cannot be found");
	    if(!zip.isDirectory())
	        throw new RuntimeException(zipName+" is not a directory");
}
}