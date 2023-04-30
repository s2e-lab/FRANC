import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		 try{
			java.lang.StringBuffer buffer = new java.lang.StringBuffer(len);
			byte[] bytesToRead = new byte[len];
			in.read(bytesToRead, 0, len);
			buffer.setLength(0);
			return bytesToRead;
		}
		catch(IOException e){
			return null;
		}
	}
}