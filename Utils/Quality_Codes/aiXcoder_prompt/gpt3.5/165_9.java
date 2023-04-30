import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID165{
	/**
	* Decode base64 string to bytes
	*/
	public static byte[] base64decode(String base64string){
			return Base64.getDecoder().decode(base64string);
	}

	/**
	* Encode bytes to base64 string
	*/
	public static String base64encode(byte[] bytes){
		return Base64.getEncoder().encodeToString(bytes);
	}

	/**
	* Hash a string using SHA-256 algorithm
	*/
	public static String sha256hash(String message){
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(message.getBytes(StandardCharsets.UTF_8));
			BigInteger number = new BigInteger(1, hash);
			StringBuilder hexString = new StringBuilder(number.toString(16));
			while (hexString.length() < 32){
				hexString.insert(0, '0');
			}
			return hexString.toString();
		}
		catch (NoSuchAlgorithmException nsae){
			System.out.println("Error: " + nsae.getMessage());
			return null;
		}
	}

	/**
	* Main method
	*/
	public static void main(String[] args) throws IOException {
		// Input string to encode/decode/hash
		String inputString = "Hello, World!";

		// Encoding to base64
		String encoded = base64encode(inputString.getBytes(StandardCharsets.UTF_8));
		System.out.println("Base64 encoded string: " + encoded);

		// Decoding from base64
		byte[] decodedBytes = base64decode(encoded);
		String decoded = new String(decodedBytes, StandardCharsets.UTF_8);
		System.out.println("Base64 decoded string: " + decoded);

		// Hashing with sha256
		String hash = sha256hash(inputString);
		System.out.println("SHA-256 hash of the input string: " + hash);
	}
}