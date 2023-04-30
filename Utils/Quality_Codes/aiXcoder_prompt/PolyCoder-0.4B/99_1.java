import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID99{
	/**
	* Convert a boolean value into a string.
	*/
	public static String boolToString(boolean b){
			String s;
			try {
				if(b == true ){
					s = "true";
				} else if(b == false){
					s = "false";
				} else {
					s = "";
				}
			} catch (Exception e) {
				// ignore, will get the message
			}
			return s;
	}
}