import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID60{
	/**
	* convert byte array to a hex string
	*/
	public String bytesToHex(byte[] bytes){
			//they contain the byte array with no data...
			String hex = HexEncoding.INSTANCE.toHex(bytes);
			if (hex == null)
				return null;
			return hex;
	}

	/**
	* convert string to string
	*/
	public String toString(){
		//return this;
		StringBuffer hex = new StringBuffer();
}
}