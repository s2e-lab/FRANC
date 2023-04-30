import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID100{
	/**
	* Convert an arbitrary text encoding to its canonical name.
	*/
	public static String canonicalEncodingName(String encoding){
		if (encoding!=null){
			if (encoding.toLowerCase().startsWith("utf")){
				return "UTF-8";
			}else{
				return "ISO-8859-"+encoding+";";
			}

		}else{
			return "ISO-8859-1";
		}
	}

}