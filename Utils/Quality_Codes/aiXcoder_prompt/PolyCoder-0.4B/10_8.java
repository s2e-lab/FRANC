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
			File backupFile = new File(directory, ".backup");
			Files.list(backupFile);
			File[] files = backupFile.listFiles();

			List<String> jsonFiles = new ArrayList<>();

			String filename = null;
			String jsonFilename = null;
}
}