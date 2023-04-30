import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
			OutputStream out = null;
			if ( file!= null ) {
				out = new FileOutputStream(file, true);
				new BufferedOutputStream(out, LINE_SIZE).write(new String(lines.toArray()));
			}
	}
}