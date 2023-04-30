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
	    //Open the file using FileInputStream
		File file = new File(filename);
		FileInputStream inputStream = new FileInputStream(file);

		//Decode the file contents with Base64
		String imageData = "";
		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = inputStream.read(buffer)) != -1) {
			imageData += Base64.getEncoder().encodeToString(buffer, 0, bytesRead);
		}

		//Close the input stream
		inputStream.close();

		return imageData;
	}
	catch(Exception ex){
		System.out.println("Error reading image data: " + ex.getMessage());
		return "";
	}
}

public static void main(String[] args) {

	//Read the image data from the file
	String imageData = readImageData("image.jpg");
	
	//Print the length of the encoded data
	System.out.println("Encoded image data length: " + imageData.length());

	//Decode the data to make sure it is valid
	byte[] decodedData = Base64.getDecoder().decode(imageData);
	System.out.println("Decoded image data length: " + decodedData.length);
  }
}