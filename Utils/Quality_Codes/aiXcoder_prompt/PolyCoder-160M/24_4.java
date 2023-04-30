import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
			synchronized(file.getParent() ){
				for (Iterator i=lines.iterator();i.hasNext();) {
					String line= (String)i.next();
					line=line.trim().replace('\n',' ');
					writeFile(lines, file);
				}
			}
	}

	//=================================================================================================
	//                                             
}