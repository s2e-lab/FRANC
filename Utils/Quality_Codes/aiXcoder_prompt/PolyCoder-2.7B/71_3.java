import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
			int crc = 0xffffffff;
			int j=0;

			for(j = 0; j < bytes.length; j++){
				crc = ((crc>>7) & 0x01) ^ ((crc<<8) ^ bytes[j])
						^ (((crc>>14) & 0x01) ^ ((crc>>8) ^ (bytes[j]<<7)));

				crc = (crc&0xffff) + (crc >> 16);

			}
			return (crc ^ 0xffffffff) & 0xffffffff;

	}
}