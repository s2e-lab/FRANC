import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			Properties f=new Properties();
			f.load(Properties.Files.getConfigValue("home", "lf5"));
			System.out.println("Loading properties from:" + f.getPropertyValue("name", "LFRock"));
	}
	
	/**
	 * Constructs the "lf5" directory with all the settings specified. Any settings that do *not appear in the folder will be written to the folder location.
	 * @param location The location of the project.
	 */
	
	public static void createProjectConfigFile(String location){
}
}