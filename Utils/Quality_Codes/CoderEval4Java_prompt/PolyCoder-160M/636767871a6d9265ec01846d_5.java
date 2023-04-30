import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
		 
		
		Folder lfi = new Folder(new MruFileStore(null,".mru"),"config.ini");
		
		ldi.createDirectory(new File(System.getProperty("user.home")),null);
		
		try {
			ldi.write(new File(System.getProperty("user.home")), "config.ini.mkd", false);
		} catch(Exception ex) {
			System.out.println("Error: Can't write config.ini.mkd", ex);
		} 
	}


}