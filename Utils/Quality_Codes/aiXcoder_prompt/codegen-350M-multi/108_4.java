import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		CharArrayWriter writer = new CharArrayWriter();
		removeAllWhiteSpaces(str, writer);
		return writer.toString();
	}

	static public void removeAllWhiteSpaces(String str, Writer writer){
		if(str == null){ return; }

		boolean found = false;

		int i = 0;
}
}