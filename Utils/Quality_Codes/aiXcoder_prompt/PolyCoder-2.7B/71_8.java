import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
		 return crc32(bytes,0,bytes.length);
	}
	
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes, int offset, int length){
		long s=0;
		for(int i=0; i<length; i++){
			int b=bytes[offset+i];
			s=(s << 8)+b;
			s=s&0xFFFFFFFFL;
		}
		
		return(s&0xFFFFFFFFL);
	}
}