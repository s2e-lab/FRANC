import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		if (checkDirectoryExistence(destPath)){
			File f = new File(destPath);
			f.createNewFile();
		}
		else f.mkdir();
		InputStream in = null;
}
}