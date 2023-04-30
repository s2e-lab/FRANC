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
				// Create File object for the specified file name
				File file = new File(filename);

				// Create FileInputStream object for the file
				FileInputStream fis = new FileInputStream(file);

				// Create ByteArrayOutputStream object
				ByteArrayOutputStream bos = new ByteArrayOutputStream();

				// Create byte array object of 1024 bytes
				byte[] byteArray = new byte[1024];

				// Read bytes from the file and write them to ByteArrayOutputStream object
				int bytesRead;
				while ((bytesRead = fis.read(byteArray)) != -1){
					bos.write(byteArray, 0, bytesRead);
				}

				// Close input stream and byteArrayOutputStream object
				fis.close();
				bos.close();

				// Convert byte array to base64 encoded data
				byte[] encodedBytes = Base64.getEncoder().encode(bos.toByteArray()); 

				// Convert byte array to String object
				String encodedString = new String(encodedBytes);

				// Return the base64 encoded string
				return encodedString;
			}catch(Exception ex){
				// Handle exceptions
				ex.printStackTrace();
				return null;
			}
	}
	
	/**
	* Decode the base64 encoded data and write it to a JPEG file.
	*/
	public static void writeImageData(String filename, String encodedData){
		try{
			// Create byte array object from the base64 encoded string
			byte[] decodedBytes = Base64.getDecoder().decode(encodedData);

			// Create OutputStream object for the specified file name
			FileOutputStream fos = new FileOutputStream(filename);

			// Write decoded bytes to the file
			fos.write(decodedBytes);

			// Close output stream
			fos.close();

			System.out.println("Image has been written to file "+filename+" successfully");
		}catch(Exception ex){
			// Handle exceptions
			ex.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		String filename = "test.jpeg";

		// Call the readImageData method to read the image data from the file
		String encodedData = readImageData(filename);

		// Print the base64 encoded data
		System.out.println("Base64 Encoded Data:\n"+encodedData+"\n");

		// Call the writeImageData method to write the decoded image data to a file
		writeImageData("output.jpeg", encodedData);
	}
}