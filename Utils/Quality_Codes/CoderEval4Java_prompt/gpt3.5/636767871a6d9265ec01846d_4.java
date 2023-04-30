import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String directoryName;
			
		// Get the user's home directory
		String homeDir = System.getProperty("user.home");

		// If running on a Windows 2000 or higher machine
		if (System.getProperty("os.name").contains("Windows")){
			directoryName = homeDir + "\\Documents and Settings\\lf5";
		}
		else{
			directoryName = homeDir + "/.lf5";
		}

		// Create the directory if it doesn't exist
		File directory = new File(directoryName);
		if (!directory.exists()) {
			directory.mkdirs();
		}
	}	
}