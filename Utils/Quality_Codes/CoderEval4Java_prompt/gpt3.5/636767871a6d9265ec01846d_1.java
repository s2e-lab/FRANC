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
		
		File lf5Dir = new File(homeDir, "lf5");
		
		if (!lf5Dir.exists()){
			boolean success = lf5Dir.mkdir();
			if (!success){
				System.err.println("Unable to create configuration directory "+lf5Dir.getAbsolutePath());
			}
		}
	}
	
	/**
	 * Reads the Most Recently Used File list from the MRU.dat file in the lf5 directory.
	 * @return an array of Strings that represent the file names in the MRU list.
	 */
	
	public static String[] getFileList(){
		
		Vector fileVector = new Vector();
		String[] fileList = null;
		
		try{
			String homeDir = System.getProperty("user.home");
			File mruFile = new File(homeDir + File.separator + "lf5", "MRU.dat");
			if (mruFile.exists()){
				BufferedReader in = new BufferedReader(new FileReader(mruFile));
				String inputLine = null;
				while ((inputLine = in.readLine()) != null){
					if (!inputLine.equals("")){
						fileVector.add(inputLine);
					}
				}
				in.close();
			}
			
			fileList = new String[fileVector.size()];
			fileList = (String[]) fileVector.toArray(fileList);
			
			
		}catch(Exception e){
			System.err.println("Unable to read file list "+e.getMessage());
		}
		return fileList;
	}

	/**
	 * Writes the Most Recently Used File list to the MRU.dat file in the lf5 directory.
	 * @param fileList an array of Strings that represent the file names in the MRU list.
	 */
	
	public static void writeMRUListToDisk(String[] fileList){
		
		try{
			String homeDir = System.getProperty("user.home");
			File mruFile = new File(homeDir + File.separator + "lf5", "MRU.dat");
			FileWriter out = new FileWriter(mruFile);
			for (int i=0; i<fileList.length; i++){
				out.write(fileList[i]+"\n");
			}
			out.close();
			
		}catch (Exception e){
			System.err.println("Unable to write MRU list "+e.getMessage());
		}
	}
}