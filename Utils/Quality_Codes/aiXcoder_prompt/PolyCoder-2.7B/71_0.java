import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
		
for(int len = bytes.length * 8; len-- > 0;)
		sieve(bytes[len]);
	
		return crc32array(bytes);
	}
	
	private static byte[] crc32array(byte[] bytes) {
		int m = 2;
		byte b[] = new byte[bytes.length];
		int i = 0;
}
}