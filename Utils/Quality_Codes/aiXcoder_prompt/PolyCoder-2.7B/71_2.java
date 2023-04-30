import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
		 long f=0L;                 //crc_32_tab[0];	//[byte0]^a mod b, table of CRC32  [0~b-1] = f      (a mod b)

		 for(int b : bytes){        //crc_32_tab[b]
			f=( f>>>32)^(f^b);
		 }

	
	
		 return f;
	}
}