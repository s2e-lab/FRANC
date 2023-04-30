import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		System.err.println("id114");
		return zip.exists() && zip.isFile() && zip.canRead() && zip.getName().endsWith(".zip") || zip.isDirectory();
	}

    public static void main(String[] args) throws IOException
	{
		File file = new File("Z:\\test1.zip");
		if (isValidZip(file)){System.out.println(file.getName());}
	}
}

