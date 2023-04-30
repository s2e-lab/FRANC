import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID60{
	/**
	* convert byte array to a hex string
	*/
	public String bytesToHex(byte[] bytes){
			// make the byte array with the ascii alphabet
			 String hex = new String(bytes, "UTF-8");
			 int i;
			 for (i = 0; i < bytes.length; i++)
				hex.append(new String(bytes, i, 1).trim());
			 return hex;
	}
	/**
	* make and return a hex representation of the byte array to byte array array
	*/
	public byte[] byteArrayToHex(byte[] bytes){
		byte[][] base=  new byte[bytes.length][bytes.length];
}
}