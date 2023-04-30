import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
			File file = new File(destPath);

			if(!file.exists()){
				throw new IllegalArgumentException("Cannot find the zipfile. " + file.getAbsolutePath());
			}
			if (!file.getParentFile().exists()){
				throw new IllegalArgumentException("Cannot find parent directory. " + file.getAbsolutePath());
			}
}
}