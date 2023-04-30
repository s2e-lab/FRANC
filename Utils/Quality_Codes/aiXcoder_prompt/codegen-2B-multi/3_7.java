import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		File file = new File(fileName);
		try{
			if(!file.exists()){
				file.createNewFile();
			}
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(content);
			out.close();
		}
		catch(IOException e){
		}
	}
	/**
	* Create file, read content from file, write content to the file
	*/
	public static String readFromFile(String fileName){
		String content = "";
		
}
}