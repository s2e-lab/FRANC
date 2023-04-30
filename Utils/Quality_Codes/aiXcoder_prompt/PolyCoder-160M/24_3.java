import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		 String[] newStringArray = new String[lines.size()+1];

		 newStringArray[0] = "";
		 File.listContents(file,new String[]{newStringArray});
		File.listChanged(file, new String[]{newStringArray});
		File.listInputStream(file, new ByteArrayInputStream(newStringArray));
}
}