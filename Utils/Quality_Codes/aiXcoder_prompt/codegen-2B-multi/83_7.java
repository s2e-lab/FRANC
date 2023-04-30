import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID83{
	/**
	* Returns a new, immutable collection containing the names of all entities within the directory denoted by the current path
	*/
	public static List<String> getFiles(String dir){
		File file = new File(dir);
		List<String> fileList = new ArrayList<>();
		if(file.exists() && file.isDirectory()) {
			for (Iterator it = java.nio.file.Files.walk(file.toPath()).iterator(); it.hasNext();){
				fileList.add(it.next().toString().toLowerCase());
			}
		}
		return fileList;
	}

	public static void main(String args[]){
}
}