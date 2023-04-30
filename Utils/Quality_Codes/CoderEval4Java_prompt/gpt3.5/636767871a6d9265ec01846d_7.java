import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String os = System.getProperty("os.name").toLowerCase(); // Get the operating system name
String userHome = System.getProperty("user.home"); // Get the user home directory path

if(os.contains("win")){ // If the OS is Windows
	File mruDir = new File(userHome + "\\Documents and Settings\\lf5");
	if(!mruDir.exists()){
		mruDir.mkdir();
	}
}
else{ // For all other OS
	File mruDir = new File(userHome + "/lf5");
	if(!mruDir.exists()){
		mruDir.mkdir();
	}
}
	}
} 

/**
 * This program creates a directory for the MRU file list to be stored. It checks whether the operating system is Windows, and if so, creates the directory in the Documents and Settings directory. On all other platforms, it creates the directory in the user.home directory. The class name is MRUFileManager and the method for creating the directory is createConfigurationDirectory(). 
 */