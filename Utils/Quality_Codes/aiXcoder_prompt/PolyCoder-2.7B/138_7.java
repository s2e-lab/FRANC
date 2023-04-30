import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID138{
	/**
	* Convert byte array to binary String
	*/
	public static String toBinary(byte[] pBytes) {
		 
	 	 String code = null;
		 String str1=""+pBytes.length;
		 int i=pBytes.length;
		 for(int count=0;count<6;count++){
			if (count==0) code=code+str1;
			if (count<14) code=code+str1+Integer.toString(pBytes[i-count]+256);
		 }
		 return code;
		
	}
	/**
	* Convert byte array to hex String
	* @param pBytes array containing data bytes
	*/
}