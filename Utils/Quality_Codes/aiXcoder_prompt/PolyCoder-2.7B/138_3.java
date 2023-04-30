import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID138{
	/**
	* Convert byte array to binary String
	*/
	public static String toBinary(byte[] pBytes) {
		 if ( pBytes == null ){
			return null;
		}
	    StringBuffer sb =new StringBuffer();
		for (byte element : pBytes){
			sb.append(Integer.toHexString(element & 0xFF));
			sb.append(' ');
		}
		return sb.toString().substring(0,(sb.length()-1));		
	}
	
	/**
	* Convert String to byte array
	*/
	public static byte[] fromBinary( String sInput,String[] sArray){
}
}