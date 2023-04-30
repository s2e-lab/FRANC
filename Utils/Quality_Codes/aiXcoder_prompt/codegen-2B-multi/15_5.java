import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		try {
			File file = new File(sourcePath);
			System.out.println("Source=["+sourcePath+"]");
			System.out.println("Destination=["+destPath+"]");
			if(file.getName().equals(".DS_Store")){
				System.out.println("ignored because of.DS_Store");
				return;
			}
				if(file.isDirectory()) {
										file = new File(sourcePath + File.separator + "..");
					File dir1 = new File(