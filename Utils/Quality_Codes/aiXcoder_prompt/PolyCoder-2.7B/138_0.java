import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID138{
	/**
	* Convert byte array to binary String
	*/
	public static String toBinary(byte[] pBytes) {
		
//		if (pBytes!= null) {
			// Convert the byte array into a set of characters and store them in a string.
			StringBuilder outString = new StringBuilder();
			outString.append(new String(pBytes, 0, pBytes.length));
			outString.deleteCharAt(outString.length() - 1);
			
}
}