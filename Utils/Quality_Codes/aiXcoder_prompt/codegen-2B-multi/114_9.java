import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		if (!zip.exists()) {
			System.out.println("File did not exist");
			return false;
		}
		if (!zip.isFile()) {
			System.out.println("Not a file");
			return false;
		}
		if (!zip.canRead()) {
			System.out.println("File is not readable");
			return false;
		}
		if (zip.length() == 0) {
			System.out.println("File is empty");
			return false;
		}
		return true;

}
}