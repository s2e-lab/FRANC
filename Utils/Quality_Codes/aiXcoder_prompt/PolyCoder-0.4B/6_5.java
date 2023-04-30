import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
		 short buffer[];
		
		// initialize pointer list
		
		buffer = data;	 data= null;
		buffer = buffer;
		buffer = buffer + offset;
		
		// put the shorts into the buffer
		data = new byte[data.length + 2];
		data[0] = (byte)((value & 0xffff0000)>>16);
		data[1] = (byte)((value & 0x0000ffff)>>16);
		
}
}