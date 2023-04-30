import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		 
			FileOutputStream fileStream = new FileOutputStream(file);
			InputStream stream = new BufferedInputStream(getFileInputStream(file));
			String line = new String( stream, '\n' );
			String temp = line.trim();
			if (temp.trim().length() > 0){
				if (!line.endsWith(",")) line = line + "," +line;
				line = line.replaceAll(" \n", " ");
				for (String linePart : line.split(";"))line = line + linePart + " ";
			}
		
}
}