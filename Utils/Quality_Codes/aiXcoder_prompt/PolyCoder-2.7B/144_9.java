import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		 
		ZipInputStream zis = null;
			
			if(destPath == null){
				throw new IllegalArgumentException("Destination path cannot be null.");
			}
			
			try {
				zis = new ZipInputStream( new FileInputStream(zipName));
			} catch (FileNotFoundException e) {
				throw new IllegalArgumentException(String.format("Can't %s the zip file.", zipName), e);
			}
			
}
}