import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try{
	outputStream.write(b, off, len);
} catch(IOException e){
	System.out.println("Error writing to output stream: " + e.getMessage());
}
}

/**
* Reads up to len bytes of data from the input stream into an array of bytes.
*/
public static int read(byte[] b, int off, int len, InputStream inputStream){
	try{
		return inputStream.read(b, off, len);
		
	} catch(IOException e){
		System.out.println("Error reading from input stream: " + e.getMessage());
		return -1;
	}
}

/**
* Returns a boolean value indicating whether the specified character is a digit or not.
*/
public static boolean isDigit(char c){
	return Character.isDigit(c);	
}

/**
* Returns the value of the first string parameter as a integer.
*/
public static int parseInt(String s){
	try{
		return Integer.parseInt(s);
		
	} catch(NumberFormatException e){
		System.out.println("Error converting string to integer: " + e.getMessage());
		return -1;
	}
}

/**
* Returns the value of the first string parameter as a double.
*/
public static double parseDouble(String s){
	try{
		return Double.parseDouble(s);
		
	} catch(NumberFormatException e){
		System.out.println("Error converting string to double: " + e.getMessage());
		return -1;
	}
}

/**
* Returns the value of the first string parameter as a BigDecimal.
*/
public static BigDecimal parseBigDecimal(String s){
	try{
		return new BigDecimal(s);
		
	} catch(NumberFormatException e){
		System.out.println("Error converting string to BigDecimal: " + e.getMessage());
		return BigDecimal.ZERO;
	}
}
}