import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID126{
	/**
	* Unzip the contents of the given zip in the given directory (create it if it doesn't exist)
	*/
	public static void unzip(String zipPath, String destDirPath){
			try{
		    File zip = new File(destDirPath);
		    if(zip.exists()){
				System.err.println("ERROR - ID126 - destination file exists with name: "+zipPath);
				System.err.println("INFO - cannot unzip directory with name: "+destDirPath);
					exit(-1);
	    }
			 	System.out.println("INFO - cannot unzip directory with name: "+destDirPath);
			 	if(zip.createNewFile()) {
					printZip(zip