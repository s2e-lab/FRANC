import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
			try {
				ZipInputStream zIn = new ZipInputStream(new FileInputStream(zipFile(destPath, zipName)));
				ZipEntry firstEntry = zIn.getNextEntry();
				String zipFileName = firstEntry.getName();
				File file; 
				if("-test.zip".equals(zipFileName)){
					//System.out.println(zipFileName);
					FileInputStream fileInputStream = new FileInputStream(new File(destPath));
					fileInputStream.read();
					
					BufferedReader bufferedReader = new BufferedReader(new StringReader(