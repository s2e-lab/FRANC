import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		/*ZipFile is the java class to represent zip files
		 * and the read() function to read from the
		 * file
		 */
		ZipFile z = null;
		try{
			z = new ZipFile(zip.getPath());
		}catch(Exception e){
			return false;
		}

		if(z.size()!= 4)
			return false;

		if(!z.getEntry("data.dat").isDirectory())
			return false;

		return true;
	}

}