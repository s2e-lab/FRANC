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
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.newLine();
			bw.close();   
			fw.close();
		}catch (IOException e) {
            e.printStackTrace();
		} 
	}

	/**
	* Get content from file.
	*/
	public static String readFromFile(String fileName){
}
}