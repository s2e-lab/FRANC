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
			FileReader f = new FileReader(sourcePath);
			f.skip(sourcePath.length());
			FileDestination fd = new FileDestination(destPath);
			fd.save(f);
			System.exit(0);
			}
		catch(FileNotFoundException e){
			System.out.println("Error : Not found : "+sourcePath);
			}
		catch(IOException e){
			System.err.println("Error : " + sourcePath);
			}
	}
}