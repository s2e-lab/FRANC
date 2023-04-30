import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID100{
	/**
	* Convert an arbitrary text encoding to its canonical name.
	*/
	public static String canonicalEncodingName(String encoding){
		return encoding;
	}
	
	public static String canonicalDecode(byte[] bytes){
		return new String(bytes);
	}

	public static String canonicalEncode(String text){
		return text;
	}

	public static String canonicalDecodeDecimal(double dnum){
		return Double.toString(dnum);
	}

	public static String canonicalDecodeDecimalFixed(double dnum){
		return Double.toString(Math.round(dnum));
	}



}