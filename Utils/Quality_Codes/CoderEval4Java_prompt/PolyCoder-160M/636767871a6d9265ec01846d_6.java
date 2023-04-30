import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			if (Application.getApplication().isDefaultVersion()
					&& "filelist" == Application.getApplication().getSelectedApplicationName()
					&& "filelist/filesettings"!= Application.getApplication().getExitKey())
					return;
			BufferedWriter bin = new BufferedWriter(new FileWriter("ContentMrzSettings.xml"));
}
}