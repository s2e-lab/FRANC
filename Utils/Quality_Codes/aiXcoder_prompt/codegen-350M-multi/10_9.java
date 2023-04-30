import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		File directory = new File(dir);
		File[] backups = directory.listFiles();
		List<String> fileList = new ArrayList<String>();
		for (int i = 0; i < backups.length; i++){
			if(backups[i].isDirectory()){
				if(backups[i].getName().toLowerCase().endsWith(".json")){
					fileList.add(backups[i].getAbsolutePath());
				}
			}
		}
		return fileList;
	}

}