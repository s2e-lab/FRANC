import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		 extractAll(destPath, zipName, "UTF-8" /*encoding*/);
	}

	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName,String encoding){
		String pathTmp = destPath + File.separator + zipName + ".json";
		extractAll(pathTmp, encoding);	
	}
	
}