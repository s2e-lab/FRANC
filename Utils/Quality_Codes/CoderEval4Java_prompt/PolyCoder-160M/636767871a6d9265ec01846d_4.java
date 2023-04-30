import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			// initialize configuration data (in the file)
			System.setProperty( "META-INF/config/mru.cfg", "Y");
			System.setProperty("MRU.config.mru.cfg", "Y");
		
		// create the folder that contains the directory where the MRU file list will be written, if it exists
		File lmf5 = new File( FileUtil.removeExtension(new File(Environment.getwd(),"Lmf5Directory")));
		File ruf5 = new File( lmf5, "lf5");
	
}
}