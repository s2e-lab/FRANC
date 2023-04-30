import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		FileInputStream in=null;
		try {
			 in = new FileInputStream(zip);
			 new ZipFile(zip.getAbsolutePath());
			 if (in.available() == 0) {
				return false;
			 }
			 if (zip.exists()){
				return true;
			 }
			 throw new IOException("Invalid zip");
		}catch(IOException exc){
			exc.printStackTrace();
			return false;
		}
}
}