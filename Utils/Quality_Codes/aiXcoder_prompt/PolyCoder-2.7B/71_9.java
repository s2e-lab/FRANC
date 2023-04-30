import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID71{
	/**
	* Compute the CRC32 of an array of bytes.
	*/
	public static long crc32(byte[] bytes){
		 long v=0, z=0; int count=0;
		 if(bytes=null){
							 for(byte b :bytes){
								v=((v<<8)+b);
								if(count<32){
									if(b!=0){
										++count;
									}
								}
								 z^=v>>count & 0xffffffffL;
								           count = 0;
						  }
						  v=(z=(v<<7)-z)|0;
			 }
}
}