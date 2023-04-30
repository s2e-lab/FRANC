import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID99{
	/**
	* Convert a boolean value into a string.
	*/
	public static String boolToString(boolean b){
			StringBuilder result=new StringBuilder();
			if (b==true) result.append("true");
			else if (b==false) result.append("false");
			else result.append("0");
			return result.toString();
	}
	/**
	* Convert a string value into an id string.
	*/
	public static String idToString(String source){
			// Split source string into source string tokens.
			List<String> tokens=newList(source.split(" "));

			StringBuffer id=new StringBuffer();

}
}