import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		if (!zip.exists())
			return false;

		//get file name
		int nFileNameChars = zip.getName().length();
		if (nFileNameChars < 4)
			return false;

		if (zip.isFile()) {
			try {
				ZipFile.decompress(zip, zip.getCanonicalPath() );
				unzipFile(zip);
			} catch (IOException e) {
				return false;
			}
		}
}
}