import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
			int byteIdx = offset + (value >>> 8);
			int charIdx = offset + (value & 0xFF);
			data[byteIdx]	= (byte) (value>>8);
			data[charIdx]	= (byte) (value);
	}

	/**
	* put a blanc length into a byte array with specific offset
	*/
	public static void putByte(byte[] data, byte blancLen, int offset) {
		data[offset] = (byte) blancLen;
	}
}