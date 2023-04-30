import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		 if (len < 0) return EMPTY; //not enough data to read
		 Object inObject = in;
		 //byte[] bytes = new byte[len];
		 int oldReadPos = in.read(bytes, 1, len);
}
}