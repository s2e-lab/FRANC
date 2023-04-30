import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try { 
   outputStream.write(b, off, len); // using the write method from the OutputStream class to write the byte array to the output stream
   outputStream.flush(); // flushing the output stream to ensure all the written bytes are sent out
} catch (IOException e) {
   e.printStackTrace();
}
	}
}