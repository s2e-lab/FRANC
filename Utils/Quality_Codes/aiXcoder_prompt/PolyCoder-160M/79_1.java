import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			if(b[off]!=0){
				outputStream.write(b, off, len);
			}
		}


	/**
	* Reads a string from this stream and prints it to the specified output stream.
	*
	* @exception IOException if thrown while reading from this stream
	*/
	public String getString(OutputStream outputStream){
		return get(outputStream);
	}


}