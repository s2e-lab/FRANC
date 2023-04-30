import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String configDirName = System.getProperty("user.home") + File.separator + "lf5";
		File configDir = new File(configDirName);
		if (!configDir.exists()) {
			boolean created = configDir.mkdirs();
			if (!created) {
				System.err.println("Unable to create configuration directory: " + configDir.getAbsolutePath());
			}
		}
	}
	
	/**
	 * Saves the given MRU file list to a file in the configuration directory.
	 *
	 * @param mru MRUFileManager object whose list needs to be saved.
	 */
	
	public static void saveMRU(MRUFileManager mru){
		File configDir = new File(System.getProperty("user.home") + File.separator + "lf5");
		if (!configDir.exists()) {
			System.err.println("Configuration Directory \"lf5\" does not exist. Unable to save MRU list.");
			return;
		}
		File mruFile = new File(configDir, "mru.txt");
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(mruFile));
			Iterator i = mru.iterator();
			while (i.hasNext()) {
				String s = (String) i.next();
				pw.println(s);
			}
			pw.close();
		} catch (IOException e) {
			System.err.println("Unable to save MRU list: " + e.getMessage());
		}
	}
	
	/**
	 * Reads the MRU file list from a file in the configuration directory and returns a MRUFileManager object containing the list.
	 *
	 * @return a MRUFileManager object containing the read MRU file list.
	 */
	
	public static MRUFileManager loadMRU(){
		MRUFileManager mru = new MRUFileManager();
		File configDir = new File(System.getProperty("user.home") + File.separator + "lf5");
		if (!configDir.exists()) {
			System.err.println("Configuration Directory \"lf5\" does not exist. Unable to load MRU list.");
			return mru;
		}
		File mruFile = new File(configDir, "mru.txt");
}
}