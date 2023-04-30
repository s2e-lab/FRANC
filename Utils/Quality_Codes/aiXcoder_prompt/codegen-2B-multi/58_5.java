import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		byte[] out = new byte[4];
		for(long i=0;i<4;i++){
			out[i] = (byte)value;
			value >>>= 8;
		}
		return out;
	}

	/**
	* Converts a string of hexadecimal characters into a big endian array of bytes.
	*/
	public static byte[] hexToByteArray(String hex){
		byte[] out = new byte[hex.length()/2];
}
}