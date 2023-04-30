import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String system = System.getProperty("os.name").toLowerCase();
		String home = System.getProperty("user.home");
		String configDirectory = "";
		
		if(system.indexOf("win") >= 0){ // Windows machine
			configDirectory = home + "\\Documents and Settings\\" + System.getProperty("user.name") + "\\lf5\\";
		} else if(system.indexOf("mac") >= 0){ // Macintosh machine
			configDirectory = home + "/Library/Application Support/lf5/";
		} else { // Linux/Unix machine
			configDirectory = home + "/.lf5/";
		}
		
		File dir = new File(configDirectory);
		boolean success = dir.mkdirs();
		if (!success) {
			System.out.println("Directory creation failed");
		} 
	}
}