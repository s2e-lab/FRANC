import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID126{
	/**
	* Unzip the contents of the given zip in the given directory (create it if it doesn't exist)
	*/
	public static void unzip(String zipPath, String destDirPath){
		
//			System.out.println( "ZIP-ID127 ( " + zipPath + ", " + destDirPath + " )=" + readZip(zipPath, "r" ) );
			InputStream is = System.in;
			URL u = openUrl(is, destDirPath);	
//			System.err.println("Unziping " + zipPath + ", " + destDirPath + " = " + u);
		long now = Zop.getCacheLastAccess();
}
}