import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try {
			outputStream.write(b, off, len);
			outputStream.flush();
		} catch (IOException e) {
			System.out.println("An error occurred while writing to output stream: " + e.getMessage());
		}
	}

	public static void main (String[] args) throws java.lang.Exception{
		// Sample byte array
		byte[] byteArray = { 65, 66, 67, 68 };
		// Create a file output stream
		FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
		// Write the byte array to the file output stream
		write(byteArray, 0, byteArray.length, fileOutputStream);
		// Close the file output stream
		fileOutputStream.close();
		System.out.println("Data written to output.txt successfully!");
	}
}