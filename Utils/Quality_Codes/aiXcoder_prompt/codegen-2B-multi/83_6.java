import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID83{
	/**
	* Returns a new, immutable collection containing the names of all entities within the directory denoted by the current path
	*/
	public static List<String> getFiles(String dir){
		List<String> input;
		if(dir.equals(""))
			input = new ArrayList<>();
		else
			input = FileUtil.readLinesfrom("assets/"+dir);
		
		return input;
	}
}