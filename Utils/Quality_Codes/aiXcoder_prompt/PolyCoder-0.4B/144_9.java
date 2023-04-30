import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		 String[] zipFileStrings = zipName.toLowerCase().split("\\.");
			
		
//			int counter=0;// index=0;
			Arrays.sort(zipFileStrings);

		Set<String> subjFileNames= new HashSet<String>();
}
}