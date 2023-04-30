import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		File file = new File(sourcePath);
		File dest = new File(destPath);
		if(!dest.exists()){
			dest.createNewFile(); 
		}
		FileInputStream fileInStream = null;
		FileOutputStream destOutputStream = null;
}
}