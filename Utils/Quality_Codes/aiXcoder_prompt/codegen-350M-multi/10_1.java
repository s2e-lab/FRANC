import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		
		
		List<String> files = new ArrayList<String>();
		
		files.add("index.json");
		files.add("images/cities.json");
		files.add("images/states.json");

		
		File dirFile = new File(dir);
}
}