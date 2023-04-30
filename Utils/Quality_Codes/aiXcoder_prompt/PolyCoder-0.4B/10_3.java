import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
			if(StringUtils.isEmpty(dir)){
				throw new RuntimeException("Backup directory path is empty.");
			}

        List<String> list = new ArrayList<String>();

		List<File> files = new ArrayList<File>();
		List<String> listFiles = new ArrayList<String>();
}
}