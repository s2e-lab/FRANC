import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String osName = System.getProperty("os.name");
String userHome = System.getProperty("user.home");
String configDirPath = "";

// Set the configuration directory path depending on the OS
if (osName.startsWith("Windows")) {
    configDirPath = userHome + "\\Documents and Settings\\lf5";
} else {
    configDirPath = userHome + "/lf5";
}

// Create the configuration directory
File configDir = new File(configDirPath);
if (!configDir.exists()) {
    configDir.mkdirs();
}
	}
}