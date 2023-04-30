import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		try{
			FileOutputStream out = new FileOutputStream(fileName);
			out.write(content.getBytes());
			out.close();
		}/* Exception if file does not exist */ catch (IOException e) {
			System.err.println("Could not write to file "+fileName);
			System.exit(143);
		}
	}

	/**
	 * Main method to write content to file.
	 * @param content of ID3 file
	 * @param fileName name of output file.
	 */
}