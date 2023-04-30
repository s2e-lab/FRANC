import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		return new byte[] {
			(byte)(value & 0xff),
			(byte)(value >> 8 & 0xff),
			(byte)(value >> 16 & 0xff),
			(byte)(value >> 24 & 0xff),
			(byte)(value >> 32 & 0xff),
			(byte)(value >> 40 & 0xff),
			(byte)(value >> 48 & 0xff),
			(byte)(value >> 56 & 0xff) };
	}

}