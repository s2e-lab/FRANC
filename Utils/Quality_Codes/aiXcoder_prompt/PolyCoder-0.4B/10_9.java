import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
			JsonArray json = new JsonArray(dir.replace(Pattern.quote("backup://"),"/"));
			List<String> backupsList = new ArrayList<>();
}
}