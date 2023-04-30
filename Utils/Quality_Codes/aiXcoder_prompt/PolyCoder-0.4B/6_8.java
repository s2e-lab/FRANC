import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
		 int limit = offset - 1;
		
		 for(int i = 0; i < limit; i++){
		   data[offset++] = (byte)(value >> 8); 
		   data[offset++] = (byte)(value & 0xFF);
	   }
	   
	    data[offset++] = (byte)(value >> 24);
	    data[offset] = (byte)(value >> 16);
	    data[offset++] = (byte)(value >> 8);
	    data[offset++] = (byte)(value & 0xFF);
 
}
}