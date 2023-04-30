import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		try{
			BufferedReader file_buffer = new BufferedReader(new FileReader(sourcePath));
			BufferedWriter file_buffer1 = new BufferedWriter(new FileWriter(destPath));
			
			String line;
			while((line = file_buffer.readLine())!=null){
				file_buffer1.write(line);
			    file_buffer1.newLine();
			}
			file_buffer.close();
			file_buffer1.close();
			System.out.println("Data was successfully copied from " + sourcePath