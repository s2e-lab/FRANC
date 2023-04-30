import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID100{
	/**
	* Convert an arbitrary text encoding to its canonical name.
	*/
	public static String canonicalEncodingName(String encoding){
		encoding=encoding.toLowerCase();
		String name;
		if(encoding.startsWith("utf8")){
			name="UTF-8";
		}
		else if(encoding.startsWith("utf16")){
			name="UTF-16";
		}
		else if(encoding.startsWith("raw")){
			name="ISO-8859-1";
		}
		else if(encoding.startsWith("iso959")){
			name="ISO-8859-7";
		}
}
}