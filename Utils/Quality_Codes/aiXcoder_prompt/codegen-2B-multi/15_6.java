import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		/**
		* Check if there is a file to copy: if not, quit
		*/
		if (!(new File(sourcePath)).exists()){
			return;
		}
		File sourceFile = new File(sourcePath);
		String line;
}
}