import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		java.util.Scanner s=new java.util.Scanner(in).useDelimiter("\\n");
		byte[] bytes=new byte[len];
		int count=0;
		while(s.hasNext()){
			s.next();
			bytes[count]= (byte)s.nextInt();
			count++;
		}
		return bytes;
	}
	public static void writeBytes(OutputStream out, byte[] bytes){
}
}