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
			ZipFile zip= new ZipFile(destPath);
			Enumeration<? extends ZipEntry> enumeration= zip.entries();
			while (enumeration.hasMoreElements()) {
				ZipEntry zipEntry= enumeration.nextElement();
				if (!zip.getInputStream(zipEntry).available()==false) {
					try {
						File tempFile=new File(destPath+ "."+zipEntry.getName());
						if (!tempFile.delete()) {
							System.out.println("Delete "+tempFile.getName());
						}
