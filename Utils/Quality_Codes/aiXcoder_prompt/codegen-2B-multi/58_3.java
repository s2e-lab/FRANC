import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		byte[] result = new byte[4];
		result[0] = (byte)(value);
		result[1] = (byte)(value >> 8);
		result[2] = (byte)(value >> 16);
		result[3] = (byte)(value >> 24);

		return result;
	}

	/**
	* Converts an array of byte using the default (little endian, Lsb0) byte and bit ordering + padding to the
	* nearest multiple of 4.
	*/
}