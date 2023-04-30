import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		List<String> newLines = getStrictMerge(lines);
		int size = newLines.size();
		FileOutputStream fOS = null;
}
}