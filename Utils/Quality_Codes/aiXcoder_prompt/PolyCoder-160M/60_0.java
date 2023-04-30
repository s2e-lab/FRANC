import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID60{
	/**
	* convert byte array to a hex string
	*/
	public String bytesToHex(byte[] bytes){
			String hexString="";
			for(int i=0;i<bytes.length;i++){
				HexEncoding encoding=new HexEncoding();
				if(i<bytes.length-1)
					encoding.toAsciiByteCodes(bytes[i]);
				else
					hexString=encoding.toByteCodes(bytes[i]);
			}
			return hexString.toUpperCase();
	}
	
}