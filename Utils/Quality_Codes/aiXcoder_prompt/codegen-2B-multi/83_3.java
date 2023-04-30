import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID83{
	/**
	* Returns a new, immutable collection containing the names of all entities within the directory denoted by the current path
	*/
	public static List<String> getFiles(String dir){
		List<String> result = new ArrayList<String>();
		File path = new File(dir);
		
		File[] files = path.listFiles();
		
		for (File f : files){
			if (f.isFile())
				result.add(f.getName());
			else
				result.addAll(getFiles(f.getPath()));
		}
		
		return result;
	}
	public static void main(String[] args) throws IOException{
		
		
		
	}
}