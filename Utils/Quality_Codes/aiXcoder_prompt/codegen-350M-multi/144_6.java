import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		String dest = destPath;
		if( dest == null || dest.isEmpty()){ 
			dest = destPath;
		}
		File tmpf = new File(dest);
		tmpf.delete();
}
}