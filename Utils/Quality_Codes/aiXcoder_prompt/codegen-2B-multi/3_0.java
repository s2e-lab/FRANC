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
			FileWriter fs = new FileWriter(fileName);
			fs.write(content);
			fs.close();
		} catch (IOException x){
			System.err.println("IOException caught...");
		}
	}
	/**
	* Generate random number between 0 and 100 and return it.
	*/
	public static int generateRandomNumber(){
		int n;
		Random generator = new Random();
		n = generator.nextInt(101);
		return n;
	}
}