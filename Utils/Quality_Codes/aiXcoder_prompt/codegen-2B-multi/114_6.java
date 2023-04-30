import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		File parent = zip.getParentFile();
		return zip.exists() && zip.canRead() && parent.exists() && parent.canRead();
	}

	public static void zip(String[] zips, String output) throws FileNotFoundException{
		FileOutputStream fos = new FileOutputStream(output+".zip");
		ZipOutputStream zip = new ZipOutputStream(fos);
}
}