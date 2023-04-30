import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
			long x=0;
			for(int n=0; n<bytes.length; n++){
				x=crc32(x,bytes[n]&127);
				x=crc32(x,bytes[n]>>7);
			}
			return x;
	}

	/**
	* Compute a 64-bit CRC to compute the CRC32 of an array of bytes.
	*/
	public static long crc32(long[] array,int length){
			long x=0;
			int i=0;

}
}