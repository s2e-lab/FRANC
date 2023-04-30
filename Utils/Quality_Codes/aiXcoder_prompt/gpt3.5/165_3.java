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
	* Calculate the sha-256 hash of a byte array
	*/
	public static byte[] sha256(byte[] data) throws Exception{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(data);
		return md.digest();
	}

	/**
	* Convert byte array to hex string
	*/
	public static String bytesToHex(byte[] bytes){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<bytes.length;i++){
			sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

	public static void main(String[] args) throws Exception{
		// Decode the base64 string
		String base64string = "SGVsbG8gV29ybGQ=";
		byte[] decoded = base64decode(base64string);

		// Calculate the sha-256 hash of the decoded string
		byte[] sha256hash = sha256(decoded);

		// Convert the sha-256 hash to a hex string and print it out
		String hexstring = bytesToHex(sha256hash);
		System.out.println(hexstring);
	}
}