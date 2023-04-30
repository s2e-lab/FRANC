import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID83{
	/**
	* Returns a new, immutable collection containing the names of all entities within the directory denoted by the current path
	*/
	public static List<String> getFiles(String dir){
		return new ArrayList<String>(new HashSet<String>(FS.list(dir)));
	}
	
	/**
	* Returns a list of all the files and directories in the current directory along with the files and directories underneath each.
	*/
	public static List<Entity> findContents(String dir){
		FS fs = FS.newInstance();		
		List<Entity> list = new ArrayList<Entity>();
		
		//add all files
		int files=findFiles(fs.getCurrent(),list);
		
		//add all subfold
}
}