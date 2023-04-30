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
	* Convert hexadecimal string to byte array
	*/
	public static byte[] hexStringToByteArray(String hex){
		int len = hex.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                                 + Character.digit(hex.charAt(i+1), 16));
		}
		return data;
	}
	
	/**
	* Convert byte array to hexadecimal string
	*/
	public static String byteArrayToHexString(byte[] bytes){
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02X", b));
		}
		return sb.toString();
	}
	
	/**
	* Convert integer to binary string
	*/
	public static String intToBinaryString(int num){
		return Integer.toBinaryString(num);
	}
	
	/**
	* Compute the SHA-256 digest of a byte array and return it as a hexadecimal string
	*/
	public static String sha256(byte[] bytes){
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(bytes);
			return byteArrayToHexString(hash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	/**
	* Compute the SHA-256 hash of a string and return it as a hexadecimal string
	*/
	public static String sha256(String text){
		return sha256(text.getBytes());
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		// Example usage of the methods defined above
		byte[] decoded = base64decode(input);
		String hexString = byteArrayToHexString(decoded);
		String binaryString = intToBinaryString(decoded.length);
		String hashed = sha256(input);
		
		System.out.println("Base64 decoded: " + new String(decoded));
		System.out.println("Hex string: " + hexString);
		System.out.println("Binary string: " + binaryString);
}
}