import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		 byte[] b = new byte[len];
		 ByteBuffer bb = ByteBuffer.wrap(b);
		 for(int i = 0; i < len; i++)
			 bb.put((byte) in.read());
		 return b;
	}

	/**
	* Reads up to len bytes from this input stream and pushes them onto the output stream as a single int.
	*/
	public static int readI8(java.io.InputStream in, int len) {
		int ii = 0;
}
}