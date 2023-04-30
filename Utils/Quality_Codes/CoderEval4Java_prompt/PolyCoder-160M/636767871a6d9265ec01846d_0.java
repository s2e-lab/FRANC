import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
		 createConfigurationDirectory_0(); 
 }
		 

	public static void createConfigurationDirectory_0(){
		 if(System.getProperty( "java.io.tmpdir")==null ){
			 System.setProperty( "java.io.tmpdir", System.getProperty("user.dir"));
		 }
		 System.clearProperty( "java.io.tmpdir");
		 String tempFolder = System.getProperty("java.io.tmpdir");
		 int num = Integer.parseInt( tempFolder.substring(0,tempFolder.length()-2));
}
}