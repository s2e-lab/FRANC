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
			File sFile = new File(sourcePath);
			File dFile = new File(destPath);
			dFile.createNewFile();
			copy(new FileInputStream(sFile),
					new FileOutputStream(dFile));
		}
		catch (Exception e){
			System.out.println("Exception copying file: "+e.getMessage());
		}
	}

	private static void copy(FileInputStream fis, FileOutputStream fos){
}
}