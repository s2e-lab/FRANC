import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		File f;
		List<String> list = new LinkedList<String>();
		
		//Find all JSON files in directory
		File d = new File(dir);
		File[] allFiles;
		if (d instanceof File){
			allFiles = d.listFiles();
		}
		else {
			allFiles = null;
		}
}
}