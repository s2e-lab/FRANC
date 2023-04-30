import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		List<String> allBackups = new ArrayList<String>();
		//This loop iterates through the directory and assembles the backup lists.
		
		int size = 0;
		//System.out.println("Reading the list of backups in " + dir);
		File[] files = new File(dir).listFiles(new FilenameFilter(){

			public boolean accept(File dir, String name){
				return (new File(dir, name)).isFile();			
			}
		});
}
}