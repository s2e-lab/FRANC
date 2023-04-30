import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try{
		outputStream.write(b, off, len);
	}catch(IOException e){
		e.printStackTrace();
	}
}

/**
* Reads up to len bytes of data from the input stream into an array of bytes.
*/
public static byte[] read(int len, InputStream inputStream){
	byte[] byteArray = new byte[len];
	try{
		inputStream.read(byteArray, 0, len);
	}catch(IOException e){
		e.printStackTrace();
	}
	return byteArray;
}

/**
* Generates a random string of given length using ASCII characters.
*/
public static String generateRandomString(int length){
	String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	Random rand = new Random();
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < length; i++){
		int index = rand.nextInt(charset.length());
		sb.append(charset.charAt(index));
	}
	return sb.toString();
}

/**
* Computes the hash of the input data using SHA-256 algorithm.
*/
public static byte[] computeSHA256(byte[] input){
	byte[] hash = null;
	try{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		hash = md.digest(input);
	}catch(Exception e){
		e.printStackTrace();
	}
	return hash;
}

public static void main(String args[]){
	// Sample usage of the above methods
	String msg = generateRandomString(10); // Generating a random string of length 10
	byte[] msgBytes = msg.getBytes(); // Converting the string to byte array
	byte[] hash = computeSHA256(msgBytes); // Computing the SHA-256 hash of the message
	System.out.println("Message: "+msg);
	System.out.println("SHA-256 Hash: "+Base64.getEncoder().encodeToString(hash));
}
}