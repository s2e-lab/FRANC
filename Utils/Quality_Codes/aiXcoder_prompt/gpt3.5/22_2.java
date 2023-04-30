import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID22{
	/**
	* Read the base64 encoded image data from a JPEG image.
	*/
	public static String readImageData(String filename){
			try{
			// Open the JPEG image file using FileInputStream
			FileInputStream fileInput = new FileInputStream(filename);
			// Create a ByteArrayOutputStream
			ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
			
			// Read bytes from the file input stream until there are none left
			int nRead;
			byte[] buffer = new byte[1024];
			while ((nRead = fileInput.read(buffer, 0, buffer.length)) != -1) {
				// Write the read bytes into the ByteArrayOutputStream
				byteOutput.write(buffer, 0, nRead);
			}
			
			// Convert the ByteArrayOutputStream into a byte array
			byte[] byteArray = byteOutput.toByteArray();
			
			// Encode the byte array into a base64 string
			String imageData = DatatypeConverter.printBase64Binary(byteArray);
			
			// Close the file Input Stream and ByteArrayOutputStream
			fileInput.close();
			byteOutput.close();
			
			// Return the base64 encoded image data
			return imageData;
		}catch(IOException e){
			// Return null if there is an IOException
			return null;
		}
	}

	/**
	* Main method to test readImageData()
	*/
	public static void main(String[] args){
		String filename = "image.jpg";
		String imageData = readImageData(filename);
		System.out.println(imageData);
	}
}