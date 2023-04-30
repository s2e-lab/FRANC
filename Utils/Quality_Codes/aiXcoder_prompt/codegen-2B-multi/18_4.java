import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		return readString(in, len).getBytes();
	}

	/**
	* Returns the current line number of this input stream (as far as the reader can tell). The line number refers
	* to the beginning of a string token, as returned from the current \r\n combination and including that whitespace
	* from the beginning of the line. This means that line numbers will be in the range of 1 to 2 billion (23
	* decimal times the current line number)
	*/
}