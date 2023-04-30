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
			if (file.exists()){
				// read current file and then update current file
				String newFileContent = readFileContent(fileName);
				updateString(content, newFileContent);
				saveFile(newFileContent, fileName);
			}else{
				// create an empty file
				saveFile("", fileName);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
}