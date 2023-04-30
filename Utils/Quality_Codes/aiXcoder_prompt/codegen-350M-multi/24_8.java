import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		try{
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(file.getAbsoluteFile().getWriter()));
			out.write(lines.getClass().getName());
			//out.write(System.getProperty("line.separator"));	//This is what we are expecting. Don't change the way you write those lines (they might cause problems)
			for(String line : lines){
				out.write(String.valueOf(line));
				out.write("\n");
			}
			out.close();
