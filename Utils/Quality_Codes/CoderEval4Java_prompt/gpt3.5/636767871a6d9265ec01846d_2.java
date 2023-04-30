import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String directoryName = System.getProperty("user.home") + File.separator + "lf5";
		File directory = new File(directoryName);
		if(!directory.exists()){
			boolean created = directory.mkdir();
			if(created){
				System.out.println("Configuration directory created: " + directoryName);
			}else{
				System.out.println("Failed to create configuration directory: " + directoryName);
			}
		}else{
			System.out.println("Configuration directory already exists: " + directoryName);
		}
	}
	
	/**
	 * Writes the MRU list to file.
	 * @param mruList Vector of MRUFile objects.
	 */
	public static void saveMRUList(Vector<MRUFile> mruList){
		String directoryName = System.getProperty("user.home") + File.separator + "lf5";
		File directory = new File(directoryName);
		
		if(!directory.exists()){
			System.out.println("Configuration directory not found: " + directoryName);
			return;
		}

		File mruFile = new File(directoryName + File.separator + "mruList.txt");
		try{
			FileWriter fw = new FileWriter(mruFile);
			for(int i=0; i<mruList.size(); i++){
				fw.write(mruList.elementAt(i).getFile().getAbsolutePath());
				fw.write("\n");
			}
			fw.close();
			System.out.println("MRU list saved");
		}catch(IOException e){
			System.out.println("Failed to save MRU list: " + e.getMessage());
		}
	}
	
	/**
	 * Reads the MRU list from file.
	 * @return Vector of MRUFile objects.
	 */
	public static Vector<MRUFile> loadMRUList(){
		String directoryName = System.getProperty("user.home") + File.separator + "lf5";
		File directory = new File(directoryName);
		
		if(!directory.exists()){
			System.out.println("Configuration directory not found: " + directoryName);
			return new Vector<MRUFile>();
		}
		
		File mruFile = new File(directoryName + File.separator + "mruList.txt");
		if(!mruFile.exists()){
			return new Vector<MRUFile>();
		}
		
		Vector<MRUFile> mruList = new Vector<MRUFile>();
}
}