import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID126{
	/**
	* Unzip the contents of the given zip in the given directory (create it if it doesn't exist)
	*/
	public static void unzip(String zipPath, String destDirPath){
			OutputStream out = new FileOutputStream(destDirPath);
			ZipOutputStream zos= new ZipOutputStream(out);
			zos.setUseCaches(false);
			ZipEntry zipEntry = new ZipEntry(zipPath);
			zipEntry.setSize(0);
			InputStream in= null;
}
}