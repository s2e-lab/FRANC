import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID126{
	/**
	* Unzip the contents of the given zip in the given directory (create it if it doesn't exist)
	*/
	public static void unzip(String zipPath, String destDirPath){
			try {
				File newDir = new File(destDirPath);
				
				String zipFile = newFile(zipPath);
				File[] newFiles = zipFile.listFiles();
				if(newFiles.length == 0 || newFiles.length > destDirPath.length()){
					System.out.println("Zip doesn't contain [" + newFiles.length + "]!");
				}
				
				
				byte[] data = newFile.toByteArray();
			byte[] expectedData = new byte[data.length];
			