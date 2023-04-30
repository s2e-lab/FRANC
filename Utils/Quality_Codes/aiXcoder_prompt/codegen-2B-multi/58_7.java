import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		byte[] ret = new byte[4];
		ret[0] = (byte) (value & 0xff);
		ret[1] = (byte) (value >> 8 & 0xff);
		ret[2] = (byte) (value >> 16 & 0xff);
		ret[3] = (byte) (value >> 24 & 0xff);
		return ret;
	}//end intToByteArray

	/**
	* Converts an array of bytes into an int using the default (little endian, Lsb0) byte and bit ordering.
	*/
}