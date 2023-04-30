import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		 String line = file.toString();
		 for(Iterator it=lines.iterator(); it.hasNext();) {
			 line = escape(line, it.next());
		 }
		 file.delete();
		 file.createNewFile();
	}
	
	/**
	* Writes a Collection of Strings to a File. This does not export any variables to the file.
	*/
	public static void writeFile(File file){
		 String s = file.getName();
}
}