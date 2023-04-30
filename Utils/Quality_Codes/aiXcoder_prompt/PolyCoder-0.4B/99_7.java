import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID99{
	/**
	* Convert a boolean value into a string.
	*/
	public static String boolToString(boolean b){
			StringBuffer buf = new StringBuffer();
			if(b){
				buf.append("TRUE");
			}
			else{
				buf.append("FALSE");
			}
			return buf.toString();
		}
}

