import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		try
		{
			File file = new File(fileName);
			
			if (!file.exists())
			{
				File f = new File(file.getAbsoluteFile() + ".tmp");
				FileWriter writer = new FileWriter(f);
				writer.write(content);
				writer.close();
				
				file.createNewFile();
				f.renameTo(file);
			}
			else{	
				FileWriter writer = new FileWriter(file);
				writer.write(content);
				writer.close();