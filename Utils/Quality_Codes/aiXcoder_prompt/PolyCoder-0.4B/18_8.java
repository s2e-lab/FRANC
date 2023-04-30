import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
			byte[] bytes=new byte[len];
			in.read(bytes);

			return bytes;
	};
	/**
	* Read up to len - 1 bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len, int n){
			byte[] bytes=new byte[len*n];

			in.read(bytes,0,n);

			return bytes;
	};

}