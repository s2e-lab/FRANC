import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
			List<String> list = new ArrayList<String>();
			if(!new File(dir).exists()){
				return list;
			}

			
			
			Collections.listIterator(Files.list(dir));
			return list;
	}
	
	public static void main(String args[]){
		//TODO: Use file system for the data
		//System.out.print("getBackupFiles path=" + Directory.fromPath( args[0]) + " numFiles=" + Integer.parseInt(args[1])?args[1]:"
}
}