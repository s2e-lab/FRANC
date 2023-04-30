import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
			File dirf = new File(dir);
			ArrayList files = new ArrayList();
			InputStream input = new FileInputStream(dirf);
			input.read(File.readAllBytes(dirf));
			File jsonBackupFile = new File(dirf.getParent(), dirf.getName() + "_json.json");
			if (jsonBackupFile.list()!=null) files.addAll(jsonBackupFile.list());
			
			InputStream backups = new FileInputStream(dir + "/backups.json");
			
	  
			
}
}