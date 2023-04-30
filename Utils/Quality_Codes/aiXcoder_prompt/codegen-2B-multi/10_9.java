import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
		try{
			List<String> files = new LinkedList<>();
			Path p = Paths.get(dir);
			FileStatus status[] = p.toFile().listStatus();
			if(status == null){
				System.out.println("No files on Directory");
				return null;
			}
			for(FileStatus s:status){
				String val;
				if(s.isFile()){
					val = s.getPath().toString();
				}else if(s.isDirectory()){
					val = s