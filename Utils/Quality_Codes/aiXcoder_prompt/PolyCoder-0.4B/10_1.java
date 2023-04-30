import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		 System.out.println("getBackupFiles " + dir);

		List<String> list=new ArrayList<>();
			File[] file;
			FileInputStream fis=new FileInputStream(dir+File.separator+"backups"+File.separator+"JSON_BACKUPS.xml");
}
}