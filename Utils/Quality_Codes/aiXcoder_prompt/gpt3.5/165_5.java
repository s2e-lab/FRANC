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
	* Convert hex string to bytes
	*/
	public static byte[] hexStringToBytes(String hexString){
		hexString = hexString.replaceAll("\\s", ""); // remove any whitespace
		byte[] bytes = new byte[hexString.length() / 2];
		for(int i = 0; i < bytes.length; i++){
			bytes[i] = (byte) Integer.parseInt(hexString.substring(2*i, 2*i+2), 16);
		}
		return bytes;
	}
	
	/**
	* Convert bytes to hex string (lowercase)
	*/
	public static String bytesToHexString(byte[] bytes){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < bytes.length; i++){
			sb.append(String.format("%02x", bytes[i]));
		}
		return sb.toString();
	}
	
	/**
	* Concatenate two byte arrays
	*/
	public static byte[] concatenate(byte[] a, byte[] b){
		byte[] result = new byte[a.length + b.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		return result;
	}
	
	/**
	* Copy a byte array
	*/
	public static byte[] copy(byte[] a){
		byte[] result = new byte[a.length];
		System.arraycopy(a, 0, result, 0, a.length);
		return result;
	}
	
	/**
	* Calculate the MD5 hash of a byte array
	*/
	public static byte[] md5(byte[] bytes){
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			return md.digest(bytes);
		} catch (NoSuchAlgorithmException ex) {
			System.err.println("MD5 algorithm not found");
			ex.printStackTrace();
			return null;
		}
	}
	
	/**
	* Convert a BigInteger to a byte array
	*/
	public static byte[] bigIntegerToBytes(BigInteger bigInt){
			byte[] bytes = bigInt.toByteArray();
			if(bytes.length == 1 && bytes[0] == 0){
				// remove leading zero byte if present
				return new byte[0];
			}
}
}