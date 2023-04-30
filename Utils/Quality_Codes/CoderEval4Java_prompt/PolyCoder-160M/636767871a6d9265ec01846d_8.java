import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
		 if(File.separator == "/")
			 return;
	
		 DirectoryInfo dir = new DirectoryInfo(File.separator);
		 dir.mkdir();
	}
	 
	public static String makeUrl(){
		String url = "";
		Directory dir = new File("./Documents");
		File f = new File(dir.getName());
		url = f.getAbsolutePath();
	
		dir.mkdir();
		return url;
	}
	
}