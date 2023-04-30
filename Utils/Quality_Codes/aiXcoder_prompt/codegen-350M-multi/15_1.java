import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		byte[] bytesRead = new byte[8192];	//this seems to do well with 64 bit machines
		FileInputStream fis = new FileInputStream(sourcePath);
		FileOutputStream fos = new FileOutputStream(destPath);

		FileInputStream in = new FileInputStream(sourcePath);
		int bytesRead = -1;

}
}