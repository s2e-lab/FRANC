import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		
			File folder = new File(dir);
			File list[] = folder.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".json");
				}
			});
			
			List<String> files = new ArrayList<String>();
			
			for (File file : list){
				if (file.canRead()){
					files.add(file.getAbsolutePath());
				}
			}
			return files;
		}
	
}