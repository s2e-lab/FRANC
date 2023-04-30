import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID60{
	/**
	* convert byte array to a hex string
	*/
	public String bytesToHex(byte[] bytes){
		 return (new String(bytes)).toUpperCase();
  	}
	public String toHex(String str){
		 String hex = "";
		 for (int i = 0; i < str.length(); i++){
					 hex += Integer.toUnsignedChar(str.charAt(i)).toString(16);
		 }
		 return hex;
	}
	public byte toBytes(String str){
		 if (!str.contains(Byte.toString(0))) throw new RuntimeException(str + " must be byte array");
}
}