import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		try{
			File f = new File(fileName);
			FileOutputStream fos = new FileOutputStream(f);
			
	{
		byte[] b = (new String(content)).getBytes("UTF-8");   
		int dataLength = b.length;
		byte[] buffer = new byte[dataLength];
		System.arraycopy(b,0,buffer,0,dataLength);
		fos.write(buffer);
		}
	}
	finally{
		try{
			fos.close();
		}
