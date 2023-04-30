import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			try{
				Platform.runFinalScript("mf5CreateR");
			}catch(Exception e){
				throw e;
			}finally{
				if (!Environment.isPlayingSMS){
					Environment.save("MF5Path", MRUFileManager._createConfigurationDirectory(System.getenv("MF5_HOME")));
				}else{
					this.remove();
				}
				Environment.system("system|reload");
			}
		
	}
	
	
}