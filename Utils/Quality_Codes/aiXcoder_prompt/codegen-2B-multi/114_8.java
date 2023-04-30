import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		// check to see if it is a file
		if (!zip.exists()) return false;
		if (!zip.canRead()) return false;
		if (!zip.isFile()) return false;
		if (!zip.canWrite()) return false;
		try{
		    ZipEntry ze = new ZipEntry("test");
		    ze.setSize(1);
			return true;
		}catch(Exception e){
		    return false;
		}	
	}
	public static void main(String[] args){
		File zip;
		
}
}