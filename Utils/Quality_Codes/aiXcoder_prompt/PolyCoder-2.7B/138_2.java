import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID138{
	/**
	* Convert byte array to binary String
	*/
	public static String toBinary(byte[] pBytes) {
		 for( int i = 0; i < pBytes.length; i++ )
							if( pBytes[i] == 0x00 )
									return String.valueOf( new char[]{(char)pBytes[i], (char)pBytes[i + 1], (char)pBytes[i + 2], (char)pBytes[i + 3], (char)pBytes[i + 4], (char)pBytes[i + 5]} );
		return null;
	}

	/**
	* Convert byte String to hex String
	*/

}