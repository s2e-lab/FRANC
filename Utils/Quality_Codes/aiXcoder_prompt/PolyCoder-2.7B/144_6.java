import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
			final File file=new File(destPath);
			//create dir if necessary
			if(!file.exists()){
				if(!file.mkdir()){
					System.out.println("ERROR: Failed to create dir");
					System.out.println("Destination path:   "+destPath);
					System.out.println("Resulting path:     "+file);
					throw new java.io.IOException();
				}
			}
}
}