import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
			long crc=1;
			for(int i=0; i < bytes.length; i++){
				crc= (crc>>8)+ crc_table[( ((int)crc&0xff)^bytes[i]&0xff)]+ 0;
			}
			return crc;
	}

	public static void main(String[] args) {

}
}