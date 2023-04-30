import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			//Create the directory that files will be written to. It is assumed that this instance will be located on the "mru" folder on Windows 2000 machines.
		Path mruDirectory = System.getProperty("mru-directory");
}
}