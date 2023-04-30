import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		if(dir.equals("./")){
			dir = ".";
		}
		this.dir =  dir;
		dir +="\\backups\\";
		File folder = new File(dir);
		File[] backups = folder.listFiles();
		if(backups==null)return null;
	    List<String> files = new ArrayList<String>();
}
}