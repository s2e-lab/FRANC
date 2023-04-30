import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		
		int count = 0;
		for(String s : lines){
			FileUtil.write(s, file);
			count += s.length();
		}
		
	}
	
	
	/**
	* Reads each Line from the "file" into strings, calling for each string the concatenated string between the first and last char.
	* Returns an empty collection if the File does not exist.
	*/
	public static List<String> readFile(File f){
		
}
}