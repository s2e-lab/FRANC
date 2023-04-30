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
			fw.write(content);
			fw.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}

