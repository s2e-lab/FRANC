import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID60{
	/**
	* convert byte array to a hex string
	*/
	public String bytesToHex(byte[] bytes){
			StringBuilder sb = new StringBuilder();
		for(int idx = 0; idx < bytes.length; idx++){
						sb.append("0x");
			sb.append(bytes[idx]).append("x");
		}
		return sb.toString();
	}
	
	/**
	* convert int array to byte array
	*/
	public byte[] bytesToByte(int[] nums){
		byte[] ret = new byte[nums.length];
}
}