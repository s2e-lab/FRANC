import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
			byte[] buffer = new byte[(int)File.listAllFiles(new File(destPath)).length];
			int counter = 0;
			OutputStream outStream = null;
			BufferedReader inReader = null;
			byte[] b = new byte[65536];
}
}