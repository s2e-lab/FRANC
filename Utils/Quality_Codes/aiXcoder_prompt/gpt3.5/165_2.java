import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID165{
	/**
	* Decode base64 string to bytes
	*/
	public static byte[] base64decode(String base64string){
			byte[] decodedBytes = Base64.getDecoder().decode(base64string);
		return decodedBytes;
	}
	
	/**
	* Encode bytes to base64 string
	*/
	public static String base64encode(byte[] bytes){
		String encodedString = Base64.getEncoder().encodeToString(bytes);
		return encodedString;
	}
	
	/**
	* Convert hexadecimal string to byte array
	*/
	public static byte[] hexStringToByteArray(String hexString){
		int hexStringLength = hexString.length();
		byte[] byteArray = new byte[hexStringLength/2];
		for(int i=0; i<hexStringLength; i+=2){
			byteArray[i/2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                                 + Character.digit(hexString.charAt(i+1), 16));
		}
		return byteArray;
	}
	
	/**
	* Convert byte array to hexadecimal string
	*/
	public static String byteArrayToHexString(byte[] byteArray){
		StringBuilder sb = new StringBuilder();
		for(byte b : byteArray){
			sb.append(String.format("%02x", b & 0xff));
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		String base64string = "SGVsbG8gV29ybGQh";
		System.out.println("Base64 string: " + base64string);
		byte[] decodedBytes = base64decode(base64string);
		System.out.println("Decoded bytes: " + Arrays.toString(decodedBytes));
		
		String hexString = "48656c6c6f20576f726c6421";
		System.out.println("Hexadecimal string: " + hexString);
		byte[] byteArray = hexStringToByteArray(hexString);
		System.out.println("Byte array: " + Arrays.toString(byteArray));
		
		String originalString = "Hello World!";
		byte[] originalBytes = originalString.getBytes();
		System.out.println("Original string: " + originalString);
		System.out.println("Original bytes: " + Arrays.toString(originalBytes));
		String encodedString = base64encode(originalBytes);
		System.out.println("Encoded string: " + encodedString);
		
		byte[] decodedAgainBytes = base64decode(encodedString);
		String decodedAgainString = new String(decodedAgainBytes);
		System.out.println("Decoded again bytes: " + Arrays.toString(decodedAgainBytes));
}
}