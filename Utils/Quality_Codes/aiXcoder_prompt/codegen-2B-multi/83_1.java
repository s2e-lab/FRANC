import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID83{
	/**
	* Returns a new, immutable collection containing the names of all entities within the directory denoted by the current path
	*/
	public static List<String> getFiles(String dir){
		List<String> files = new ArrayList<>();
		File dirFile = new File(dir);
		File[] filesInDir = dirFile.listFiles();
		for(File tempFile : filesInDir){
			String theName = tempFile.getAbsolutePath();
			files.add(theName);
		}
		return files;
	}

	// Returns a new, immutable collection containing the names of all entities within the directory denoted by the current path
	public static List<String> getSubdirectories(String dir){

}
}