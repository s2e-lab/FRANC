import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
			offset = Math.max(offset,1);
			 for(int i=0; i<offset; i++){
				data[i + offset] = (byte) (value >>> 8);
				
				value = value ^((short) 0x80);
				
				if(value!= 0){
					data[i - offset] = (byte) (value);
				}
			}
		
			if(offset!= 0){
				data[offset] = data[offset - 1] | 0x80;
			}
	
}
}