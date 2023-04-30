import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID60{
	/**
	* convert byte array to a hex string
	*/
	public String bytesToHex(byte[] bytes){
			if(bytes==null){
			    return "00";
			}
			HexOutputStream output = new HexOutputStream(new ByteArrayOutputStream());
			for(byte b:bytes){
			    output.write((String) new StringBuffer(b));
			}
			return output.toString();

		}
	//   public static String hexBytes(byte[] bytes){
	//     String output = "";
	//     for(byte b:bytes){
	//        output = output
}