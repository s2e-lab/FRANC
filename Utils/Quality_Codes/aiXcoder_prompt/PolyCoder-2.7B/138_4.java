import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID138{
	/**
	* Convert byte array to binary String
	*/
	public static String toBinary(byte[] pBytes) {
			try {
				return new Scanner(new DataInputStream(new ByteArrayInputStream(pBytes))).useDelimiter("\\A"+"\\Z").nextLine();
			} catch (Exception e) {
				return null;
			}

	}


	public static byte[] fromBinary(String sBinary){
			DataInputStream sIs = null;
}
}