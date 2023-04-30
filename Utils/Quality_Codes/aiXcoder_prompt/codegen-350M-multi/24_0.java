import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		for (Iterator i = lines.iterator(); i.hasNext(); ) {
			String line = (String)i.next();
			try {
			// TODO implement a safe way to write a stream that ignores line endings...
				Writer w = new Writer(file);
				w.write(line+"\n");  // TODO should we just be trying to print the whole thing or just line by line here?

				w.close();
			}
		catch (IOException e){
 		  System.out.println("FATAL write error: "+e