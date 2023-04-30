import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID22{
	/**
	* Read the base64 encoded image data from a JPEG image.
	*/
	public static String readImageData(String filename){
			try {
			// Read the file as bytes
			File file = new File(filename);
			byte[] fileData = new byte[(int)file.length()];
			InputStream inputStream = new FileInputStream(file);
			inputStream.read(fileData);

			// Convert the bytes to base64 encoding
			String imageData = Base64.getEncoder().encodeToString(fileData);
			return imageData;
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return null;
		}
	}
	
	/**
	* Save the base64 encoded image data to a JPEG file.
	*/
	public static void saveImageData(String imageData, String filename){
		try {
			// Decode the base64 encoding
			byte[] imageDataBytes = Base64.getDecoder().decode(imageData);

			// Write the bytes to a file
			File file = new File(filename);
			OutputStream outputStream = new FileOutputStream(file);
			outputStream.write(imageDataBytes);
			outputStream.close();
		} catch (IOException e) {
			System.out.println("Error saving file: " + e.getMessage());
		}
	}
	
	/**
	* Main method to test the image data reading and writing functions.
	*/
	public static void main(String[] args){
		String filename = "image.jpg";
		String imageData = readImageData(filename);
		System.out.println("Original Image Data:\n" + imageData); // Print the base64 encoded image data
		saveImageData(imageData, "image-Decoded.jpg"); // Save the base64 encoded image data to a file
	}
}