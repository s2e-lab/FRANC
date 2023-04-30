import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		byte[] bytes = new byte[4];
		bytes[3] = (byte)(value & 128);
		bytes[2] = (byte)(value >>> 8);
		bytes[1] = (byte)(value >>> 16);
		bytes[0] = (byte)(value >>> 24);
		return bytes;
	}

	/**
	* Converts an int into an array of byte using the specified (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value, int byteOrdering){

}
}