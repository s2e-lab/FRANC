import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String homeDir = System.getProperty("user.home");
		String osName = System.getProperty("os.name");
		String filePath = "";
		
		if (osName.contains("Windows")) {
			filePath = homeDir + "\\Documents and Settings\\" + System.getProperty("user.name") + "\\lf5";
		} else {
			filePath = homeDir + "/lf5";
		}
		
		File directory = new File(filePath);
		
		if (!directory.exists()) {
			directory.mkdirs();
		}
	} 

	/**
	 * Saves the MRU file list to a file in the configuration directory.
	 * @param fileList the MRU file list to save
	 * @param fileName the name of the file to save the MRU file list to
	 */
	public static void saveMRUFiles(List<String> fileList, String fileName){
		try{
			String homeDir = System.getProperty("user.home");
			String osName = System.getProperty("os.name");
			String filePath = "";
			if (osName.contains("Windows")){
				filePath = homeDir + "\\Documents and Settings\\" + System.getProperty("user.name") + "\\lf5" + "\\" + fileName;
			}
			else {
				filePath = homeDir + "/lf5" + "/" + fileName;
			}
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			for (String file : fileList) {
				bw.write(file);
				bw.newLine();
			}
			bw.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Loads the MRU file list from a file in the configuration directory.
	 * @param fileName the name of the file to load the MRU file list from
	 * @return the MRU file list loaded from the file
	 */
	public static List<String> loadMRUFiles(String fileName) {
		List<String> fileList = new ArrayList<>();
}
}