import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte arr[] = new byte[len];
		if(in.read(arr)!= -1){
			return arr;
		}
		else {
			return null;
		}
	}


}
