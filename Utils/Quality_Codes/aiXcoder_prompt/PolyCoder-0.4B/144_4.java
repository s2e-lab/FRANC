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
				File sourceDir = new File(zipPath);
				File destDir = new File(destPath);
				ZipFile inFile = new ZipFile(sourceDir);
				FileOutputStream fileOut = new FileOutputStream(destDir);
				FileInputStream fis = new FileInputStream(sourceDir);	
				int numFiles = 1000;
		        
		        long totalSize = 0;
		        if(fis!=null){
		        	long