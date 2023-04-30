import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		File f = new File(dir);
		File[] fs  = f.listFiles();

		ArrayList<String> files= new ArrayList<String>();
		if (fs == null ){
			return files;
		}

		for(File fc : fs){
			if (fc.isFile()) {
				if (fc.getName().endsWith("json")){
					files.add(fc.getName());
				}
			}
		}

		return files;

	}


}
