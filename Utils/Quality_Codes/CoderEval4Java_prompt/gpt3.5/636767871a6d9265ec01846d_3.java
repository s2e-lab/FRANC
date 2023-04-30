import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			// Creating the configuration directory for MRU files
		String home = System.getProperty("user.home");
		String osName = System.getProperty("os.name");

		// Checking if OS is Windows 2000 to create the directory in Documents and Settings folder
		if (osName.indexOf("Windows 2000") != -1) {
			File configDir = new File(home + "\\Documents and Settings\\lf5");
			configDir.mkdir();
		} else {
			File configDir = new File(home + "/lf5");
			configDir.mkdir();
		}
	}
	
	/**
	 * Adds a file to the MRU list. If the file already exists in the list, it is moved to the top. If the maximum number of files is reached, the last file in the list is removed.
	 * @param file the file to be added to the MRU list
	 * @param maxFiles the maximum number of files to be in the MRU list
	 */
	public static void addFileToMRUList(File file, int maxFiles){
		// Getting the MRU list file in the configuration directory
		String home = System.getProperty("user.home");
		File mruFile = new File(home + "/lf5/mruList.txt");

		if (!mruFile.exists()) {
			try {
				mruFile.createNewFile();
			} catch (IOException ex) {
				System.err.println("Error creating MRU list file.");
			}
		}

		// Reading the MRU list from the file
		ArrayList<String> mruList = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(mruFile));
			String line;
			while ((line = br.readLine()) != null) {
				mruList.add(line);
			}
			br.close();
		} catch (IOException ex) {
			System.err.println("Error reading MRU list from file.");
		}

		// Checking if the file already exists in the MRU list
		boolean fileExists = false;
		String filePath = file.getAbsolutePath();
		for (int i = 0; i < mruList.size(); i++) {
			if (mruList.get(i).equals(filePath)) {
				fileExists = true;
				mruList.remove(i);
				mruList.add(0, filePath);
				break;
			}
		}

		// Adding the file to the MRU list if it doesn't already exist
}
}