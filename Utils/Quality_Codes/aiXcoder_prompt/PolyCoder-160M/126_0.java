import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID126{
	/**
	* Unzip the contents of the given zip in the given directory (create it if it doesn't exist)
	*/
	public static void unzip(String zipPath, String destDirPath){
			File zipFile = new File(zipPath);
			zipFile.createNewFile();
			FileChannel zipChannel = new FileChannel(destDirPath, "r");
			zipChannel.transfer(zipFile, 0, 1, null);
		    try{
    			zipChannel.delete();
			    } catch (Exception e) {
    			System.out.println("error - "+e);
    			System.exit(1);
    		}
    	}
}