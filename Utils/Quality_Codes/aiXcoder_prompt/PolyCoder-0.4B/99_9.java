import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID99{
	/**
	* Convert a boolean value into a string.
	*/
	public static String boolToString(boolean b){
			//return Boolean.toString(b? "true" : "false");
			return b? "true" : "false";
	}

	/**
	* Convert a integer value into a string.
	*/
	public static String intToString(int i){
			return String.valueOf(i).toString();
	}

	/**
	* Convert a floating-point value into a string.
	*/
	public static String floatToString(float i){
			return String.valueOf(i).toString();
	}
}