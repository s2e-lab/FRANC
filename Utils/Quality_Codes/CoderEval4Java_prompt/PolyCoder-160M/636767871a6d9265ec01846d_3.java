import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
		 
			String directory = "/Documents";
			String settings = "/Users/Administrator/Documents/Settings/Settings.config";
			Path root = new Path( directory );
			Path settingsFile = new Path( settings );		
			if (!settingsFile.getParent().equals(settings ) )
				root = new Path( settingsFile.getParent().resolve( "/" ) );
			List<File> files;
			if ( root.isAbsolute() )
				files = new ArrayList<File>( root.listFiles() );			 
}
}