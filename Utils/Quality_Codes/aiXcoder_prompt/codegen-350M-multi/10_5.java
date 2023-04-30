import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		
		List<String> files=new ArrayList<String>(); 
		DirectoryStream.Filter<String> test=new FilenameFilter() {
			@Override
			public boolean accept(Path path, String name) {
				return name.startsWith("json_") && name.endsWith("bck");
			}};
}
}