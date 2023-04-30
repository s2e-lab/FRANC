import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID99{
	/**
	* Convert a boolean value into a string.
	*/
	public static String boolToString(boolean b){
			return(boolToStr(b));
	}

	/**
	 * The type of this Boolean.
	 */
	public int value = 0;

	/**
	 * Return the string representation of this Boolean, such as "true".
	 */
	public String toString() {
			return( value                                       + " == "  + boolToString(value) + "\n\n" );
}
}