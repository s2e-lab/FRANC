import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		try{
		File f1=new File(sourcePath);
		File f1new = new File(destPath);
		if(f1new.exists() || f1.isFile()){
			System.out.println("file "+sourcePath+" already exists or isn't a valid file");
		}else if(f1new.isDirectory() || f1new.getParent() == null){
			System.out.println("Error, destination path doesn't follow "/usr" as separator");
		}else{			
			copyFile(f1