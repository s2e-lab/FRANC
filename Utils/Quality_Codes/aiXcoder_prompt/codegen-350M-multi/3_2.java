import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		try {
			File outFile = new File(fileName);
			FileWriter writer = new FileWriter(outFile);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	* Write content to the given file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, File file){
}
}