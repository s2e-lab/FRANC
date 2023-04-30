import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID126{
	/**
	* Unzip the contents of the given zip in the given directory (create it if it doesn't exist)
	*/
	public static void unzip(String zipPath, String destDirPath){
		
// System.out.println("UnZip: "+destDirPath);
		String dir = ".";
		dir += "data" + System.currentTimeMillis();
		dir += "data" + System.currentTimeMillis();
		String zipName = zipPath + dir;

		ZipFile zipFile = new ZipFile(zipName);
		File destDir = new File(destDirPath);
		byte[] bytes = new byte[1024];
}
}