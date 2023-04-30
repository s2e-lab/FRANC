import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		try(FileOutputStream fos = new FileOutputStream(fileName)){
			try(PrintWriter out = new PrintWriter(fos)){
				out.write(content);
			}
		}
	}

	/**
	* Read the file content into a ArrayList
	*/
	public static ArrayList<String> readFile(String fileName){
		InputStream is = new FileInputStream(fileName);
		int length;
}
}