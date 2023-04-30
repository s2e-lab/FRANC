import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
			String temp = destPath + "/" + getRandomFileName();
			if(fileExists(temp)){
					zipFileOfAllFilesInZip(destPath + "/" + zipName, temp, "");
			}else{
					try {
						extract(temp, destPath);
					} catch(Exception e2) {
						 throw new RuntimeException(e2);			
					}
	}
	}
}