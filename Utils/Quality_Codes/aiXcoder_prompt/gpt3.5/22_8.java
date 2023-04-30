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
			File file = new File(filename);
			FileInputStream fis = new FileInputStream(file);
			byte[] buffer = new byte[(int) file.length()];
			fis.read(buffer);
			fis.close();
			return Base64.getEncoder().encodeToString(buffer);
		}catch(Exception e){
			System.out.println("Error in reading image data: "+e);
			return "";
		}
	}
	
	/**
	* Write the base64 encoded image data to a JPEG image file.
	*/
	public static void writeImageData(String filename, String imageData) {
		try{
			byte[] data = Base64.getDecoder().decode(imageData);
			FileOutputStream fos = new FileOutputStream(filename);
			fos.write(data);
			fos.close();
		}catch(Exception e){
			System.out.println("Error in writing image data: "+e);
		}
	}
	
	/**
	* Main method to test image data reading and writing.
	*/
	public static void main(String[] args){
		String filename = "image.jpg";
		String imageData = readImageData(filename);
		System.out.println("Base64 encoded image data:\n"+imageData);
		
		String newFilename = "newImage.jpg";
		writeImageData(newFilename, imageData);
		System.out.println("Image file written successfully.");
	}
}