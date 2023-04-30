import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
		 byte[] newdata = new byte[offset];
		 Integer.valueOf(value).getBytesRepresentation();
		 newdata[0] = (byte) data[offset];
		 System.arraycopy(data,0,newdata,1,data.length-1);
		 System.arraycopy(newdata,data.length-1,data, offset+1, data.length-1);
	}
	
	/**
	* put a char value into a byte array with specific offset
	*/
	public static void putChar(byte[] data, char value, int offset){
	
}
}