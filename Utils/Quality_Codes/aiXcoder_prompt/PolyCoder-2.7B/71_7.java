import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
			long v=0;
			for(int i=0;i< bytes.length;i++){
				v=((v^ bytes[i])&0xFFFFFFFF)*0x80000000L;
				v=v+v%(v^ bytes[i]);
			}
			return v;
		
	
	}
	
	/** CRC32 that is not a simple checksum. */
	public static long crc32WithSkip(byte[] bytes){
			long v=0;
			int skip=1;
}
}