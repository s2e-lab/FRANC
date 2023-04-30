import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID138{
	/**
	* Convert byte array to binary String
	*/
	public static String toBinary(byte[] pBytes) {
			String ret = "";
			for (int i = 0; i < pBytes.length; ++i)
				ret += String.format("%02x ", pBytes[i]);
			return ret;
	}
	
	/**
	* Convert byte string to byte array
	* 
	*/
	public static byte[] fromBinary(String binString) {
			byte[] ret = {};
}
}