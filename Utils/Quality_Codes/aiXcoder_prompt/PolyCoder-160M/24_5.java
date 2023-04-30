import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
			if (file!= null){
				String s1 = file.getName();
				file.delete(0, s1.length());
			}
			for (String line : lines)	{
				if (line!= null){
					file.write(line + "\n");
				}
			}
			return;
	}
	/**
	* Writes Strings to a Collection, overwriting any previous file contents. Each String is converted into a line in the Collection.
	*/
}