import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		BufferedWriter writer = null;
		try {
			File file = new File(fileName);
			OutputStream outputStream = new FileOutputStream(file);
			writer = new BufferedWriter(new OutputStreamWriter(outputStream));
			writer.write(content);
			writer.flush();
		}
		catch (Exception e) {
			System.out.println("Could not create file");
			e.printStackTrace();
		}
}
}