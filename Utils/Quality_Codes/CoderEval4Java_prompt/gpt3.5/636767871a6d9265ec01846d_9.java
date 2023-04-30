import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MRUFileManager{
	/** 
	 * Creates the directory where the MRU file list will be written. The "lf5" directory is created in the Documents and Settings directory on Windows 2000 machines and where ever the user.home variable points on all other platforms.
	 */
	
	public static void createConfigurationDirectory(){
			String OS = System.getProperty("os.name").toLowerCase(); // Getting the operating system name
String homeDir = System.getProperty("user.home"); // Getting the home directory path of the user
String dirName = "lf5"; // Name of the directory to be created

if (OS.indexOf("win") >= 0) { // For Windows operating system
    String winDir = System.getenv("APPDATA"); // Getting the location of the "Roaming" directory in Windows
    File dir = new File(winDir + "\\" + dirName); // Creating the path for the directory
    dir.mkdir(); // Creating the directory
} else if (OS.indexOf("mac") >= 0 || OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0) { // For Mac or Linux operating system
    File dir = new File(homeDir + "/." + dirName); // Creating the path for the directory
    dir.mkdir(); // Creating the directory
} else { // For other operating systems
    System.out.println("Unsupported operating system");
}
} 
}