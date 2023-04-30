import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID99{
	/**
	* Convert a boolean value into a string.
	*/
	public static String boolToString(boolean b){
			String s = null;
			switch(b){
				case true:
					s='1';
					break;
				case false:
					s='0';
					break;
				default:
					s='?';
			}
			return s;
	}
	
	/**
	 * Write some output to the standard output buffer.
	 * @param value the value to be written.
	 * @param buf the string buffer to write to.
	 * @throws IOException 
	 */
}