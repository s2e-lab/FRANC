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
		bytes[3] = (byte)(value & 0x000000FF);
		value >>= 8;
		bytes[2] = (byte)(value & 0x000000FF);
		value >>= 8;
		bytes[1] = (byte)(value & 0x000000FF);
		bytes[0] = (byte)(value >> 8);
		return bytes;
	}


}