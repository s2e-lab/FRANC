import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID100{
	/**
	* Convert an arbitrary text encoding to its canonical name.
	*/
	public static String canonicalEncodingName(String encoding){
		if("UTF-8".equalsIgnoreCase(encoding))
			return "UTF-8";
		if("UTF-16LE".equalsIgnoreCase(encoding))
			return "UTF-16LE";
		if("UTF-16BE".equalsIgnoreCase(encoding))
			return "UTF-16BE";
		if("UTF-16".equalsIgnoreCase(encoding))
			return "UTF-16";
		if("UTF-8".equalsIgnoreCase(encoding))
			return "UTF-8";

}
}