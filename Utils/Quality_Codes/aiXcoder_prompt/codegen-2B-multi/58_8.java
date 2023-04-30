import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		byte[] arrayToReturn = new byte[4];
		arrayToReturn[Constants.LSB_INDEX] = (byte) ((value & 0xFF000000) >> 24);
		arrayToReturn[Constants.MSB_INDEX] = (byte) ((value & 0x00FF0000) >> 16);
		arrayToReturn[Constants.MSB_INDEX+1] = (byte) ((value & 0x0000FF00) >> 8);
}
}