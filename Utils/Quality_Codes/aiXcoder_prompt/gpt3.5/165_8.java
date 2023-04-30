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

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base64 string: ");
		String base64string = scanner.nextLine();

		// Decode base64 string to bytes
		byte[] decodedBytes = base64decode(base64string);

		// Convert bytes to BigInteger
		BigInteger bigInteger = new BigInteger(decodedBytes);

		// Display the BigInteger value
		System.out.println("BigInteger value: " + bigInteger);

		// Convert BigInteger to base 10 string
		String base10string = bigInteger.toString();

		// Display the base 10 string
		System.out.println("Base 10 string: " + base10string);

		// Encode the bytes back to base64 string
		String encodedString = base64encode(decodedBytes);

		// Display the encoded string
		System.out.println("Encoded base64 string: " + encodedString);
	}
}